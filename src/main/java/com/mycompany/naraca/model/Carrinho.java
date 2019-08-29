/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.util.CollectionUtils;

/**
 *
 * @author celso
 */
public class Carrinho {

    private String cliente;
    private List<String> produtos;
    private String produto;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        if (CollectionUtils.isEmpty(this.getProdutos())) {
            List<String> produtos = new ArrayList<>();
            produtos.add(produto);
            this.setProdutos(produtos);
        } else {
            this.getProdutos().add(produto);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Carrinho)) {
            return false;
        }
        Carrinho that = (Carrinho) o;
        return Objects.equals(getCliente(), that.getCliente())
                && Objects.equals(getProduto(), that.getProdutos());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCliente(), getProdutos());
    }

}
