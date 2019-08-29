/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.dao.AudioRepository;
import com.mycompany.naraca.model.Audio;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author celso
 */
@Controller
public class AudioController {

    private AudioRepository repository;
    
    public AudioController(AudioRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/audio/index")
    public String index(Model model) {

        List<Audio> audios = this.repository.findAll();
        model.addAttribute("audios", audios);
        return "/audio/index";
    }

    @RequestMapping("/audio/inserir")
    public String inserir(Model model) {

        Audio audio = new Audio();

        model.addAttribute("audio", audio);
        return "/audio/inserir";
    }

    @RequestMapping(value = "/audio/inserirAction", method = RequestMethod.POST)
    public String inserirAction(@ModelAttribute("audio") Audio audio,
            BindingResult result,
            ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        this.repository.save(audio);
        String mensagem = "Salvo com sucesso";
        model.addAttribute("mensagem", mensagem);
        return "/audio/index";
    }

}
