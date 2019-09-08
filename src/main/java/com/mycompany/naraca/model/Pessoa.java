/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pessoa {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private int idade;
    @JsonIgnore
    @OneToMany(mappedBy = "proprietario")
    private Set<Veiculo> veiculos;
    @JsonIgnore
    @OneToOne(mappedBy = "pessoa", cascade = {CascadeType.ALL}, orphanRemoval = true)
    private Habilitacao habilitacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    //remover duplo construtor
    public Pessoa(){};

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



    public Set<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Set<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Habilitacao getHabilitacao() {
        return habilitacao;
    }

    public void setHabilitacao(Habilitacao habilitacao) {
        this.habilitacao = habilitacao;
        habilitacao.setPessoa(this);
    }
    
    
    
}
