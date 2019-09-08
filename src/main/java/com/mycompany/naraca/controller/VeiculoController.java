/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.dao.VeiculoRepository;
import com.mycompany.naraca.model.Pessoa;
import com.mycompany.naraca.model.Veiculo;
import java.util.Set;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author celso
 */
@Controller
public class VeiculoController {
    
    private VeiculoRepository repository;
    
    public VeiculoController(VeiculoRepository repository){
        this.repository = repository;
    }
    
    @RequestMapping("/veiculo/porProprietario/{pessoa_id}")
    public String porProprietario(Model model, 
            @PathVariable(value="pessoa_id") int pessoa_id) {
        
        Pessoa proprietario = new Pessoa();
        proprietario.setId(pessoa_id);
        Set<Veiculo> veiculos = this.repository.findAllByPessoaId(pessoa_id);
        model.addAttribute("veiculos", veiculos);
        model.addAttribute("pessoa_id", pessoa_id);
        return "/veiculo/por_proprietario";
    }
    
    @RequestMapping("/veiculo/inserir/{pessoa_id}")
    public String inserir(Model model, 
            @PathVariable(value="pessoa_id") int pessoa_id) {
        
        Pessoa proprietario = new Pessoa();
        proprietario.setId(pessoa_id);
        Veiculo veiculo = new Veiculo();
        veiculo.setProprietario(proprietario);
        model.addAttribute("veiculo", "veiculo");
        return "/veiculo/inserir";
    }
    
}
