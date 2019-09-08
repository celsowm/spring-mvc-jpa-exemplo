/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.dao.PessoaRepository;
import com.mycompany.naraca.model.Pessoa;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author celso
 */
@Controller
public class PessoaController {    
    
    private PessoaRepository repository;

    public PessoaController(PessoaRepository repository) {
        this.repository = repository;
    }
    
    @RequestMapping("/pessoa")
    public String index(Model model) {
        
        List<Pessoa> pessoas = this.repository.findAll();
        model.addAttribute("pessoas", pessoas);
        return "/pessoa/index";
    }
    
    @RequestMapping("/pessoa/inserir")
    public String inserir(Model model) {
        Pessoa pessoa = new Pessoa();
        model.addAttribute("pessoa", pessoa);
        return "/pessoa/inserir";
    }
    
    @RequestMapping("/pessoa/remover/{@id}")
    public String remover(Model model, @RequestParam("id") int id) {
        this.repository.deleteById(id);
        model.addAttribute("mensagem", "Dado removido com sucesso !");
        return "/pessoa/index";
    }
    
    @RequestMapping("/pessoa/alterar/{id}")
    public String alterar(Model model, @PathVariable(value="id") int id ) {  
        Optional<Pessoa> pessoa = this.repository.findById(id);
        model.addAttribute("pessoa", pessoa.get());
        return "/pessoa/alterar";
    }
    
    @RequestMapping(value = "/pessoa/alterarAction", method = RequestMethod.POST)
    public String alterarAction(@ModelAttribute("pessoa") Pessoa pessoa, BindingResult result, ModelMap model){
        if (result.hasErrors()) {
            return "error";
        }
        this.repository.save(pessoa);
        model.addAttribute("mensagem", "Dado alterado com sucesso !");
        model.addAttribute("pessoas", this.repository.findAll());
        return "/pessoa/index";
    }
    
    @RequestMapping(value = "/pessoa/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("pessoa") Pessoa pessoa, BindingResult result, ModelMap model){
        if (result.hasErrors()) {
            return "error";
        }
        pessoa.setHabilitacao(pessoa.getHabilitacao());
        this.repository.save(pessoa);
        List<Pessoa> pessoas = this.repository.findAll();
        model.addAttribute("pessoas", pessoas);
        model.addAttribute("mensagem", "Salvo com sucesso");
        return "/pessoa/index";
    }
    
}
