/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author celso
 */
@Controller
public class TemplateController {
    
    @RequestMapping("/template/menu")
    public String menu(Model model) {
        model.addAttribute("attribute", "value");
        return "/template/menu";
    }
    
    @RequestMapping("/template/header")
    public String header(Model model) {
        model.addAttribute("attribute", "value");
        return "/template/header";
    }
    
    @RequestMapping("/template/footer")
    public String footer(Model model) {
        model.addAttribute("attribute", "value");
        return "/template/footer";
    }
    
}
