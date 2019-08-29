/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author celso
 */
@Controller
public class LoginController {

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "login/index";
    }

    @RequestMapping(value = "login/login", 
            method = RequestMethod.POST)
    public String login(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            HttpSession session,
            ModelMap modelMap) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
            session.setAttribute("username", username);
            return "login/sucesso";
        } else {
            //modelMap.put("error", "Login inválido !");
            return "redirect:../?mensagem="+"Login inválido !";
        }
    }

    @RequestMapping(value = "login/logout", method = RequestMethod.GET)
    public String logout(HttpSession session) {
        session.removeAttribute("username");
        return "redirect:../";
    }

}
