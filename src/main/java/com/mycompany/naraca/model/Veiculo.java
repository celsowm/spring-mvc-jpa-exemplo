/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Veiculo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String placa;
    private int ano;
    @ManyToOne
    private Pessoa proprietario;
    @JsonIgnore
    @ManyToMany(mappedBy = "veiculos")
    private List<AcessorioVeicular> acessoriosVeiculares;

    public Veiculo() {
    }

    public Veiculo(int id, String placa, int ano, Pessoa proprietario) {
        this.id = id;
        this.placa = placa;
        this.ano = ano;
        this.proprietario = proprietario;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public List<AcessorioVeicular> getAcessoriosVeiculares() {
        return acessoriosVeiculares;
    }

    public void setAcessoriosVeiculares(List<AcessorioVeicular> acessoriosVeiculares) {
        this.acessoriosVeiculares = acessoriosVeiculares;
    }
    
    
}
