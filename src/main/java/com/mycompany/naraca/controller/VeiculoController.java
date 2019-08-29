/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.model.Veiculo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author celso
 */
@Controller
public class VeiculoController {
    
    @RequestMapping("/veiculo/inserir/")
    public String inserir(Model model) {
        Veiculo veiculo = new Veiculo();
        model.addAttribute("attribute", "value");
        return "/veiculo/inserir/";
    }
    
}
