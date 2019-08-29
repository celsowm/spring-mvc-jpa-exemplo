/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.model.Carrinho;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author celso
 */
@Controller
@SessionAttributes("carrinho")
public class CarrinhoController {
    
 @PostMapping("/addToCart")
 public String addToCart(final Model model, @ModelAttribute Carrinho shoppingCart, final String productCode) {
  if (shoppingCart != null) {
   //add product to the shopping cart list
   shoppingCart.setProduto(productCode);
   model.addAttribute("cart", shoppingCart);
  } else {
   Carrinho cart = new Carrinho();
   cart.setCliente("Super customer");
   cart.setProduto(productCode);
   model.addAttribute("cart", cart);
  }

  return "redirect:" + "product-detail-page";
 }
    
}
