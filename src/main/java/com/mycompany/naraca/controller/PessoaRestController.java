/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.controller;

import com.mycompany.naraca.dao.PessoaRepository;
import com.mycompany.naraca.model.Pessoa;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author celso
 */
@RestController
@RequestMapping("/rest/pessoa")
public class PessoaRestController {

    private PessoaRepository repository;

    public PessoaRestController(PessoaRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<Pessoa> list() {
        return this.repository.findAll();
    }

    @GetMapping("/{id}")
    public Object get(@PathVariable int id) {
        Optional<Pessoa> pessoa = this.repository.findById(id);
        if (pessoa.isPresent()) {
            return new ResponseEntity<>(pessoa.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable int id, @RequestBody Pessoa newPessoa) {
        Optional<Pessoa> oldPessoa = this.repository.findById(id);
        if (oldPessoa.isPresent()) {
            newPessoa.setId(id);
            this.repository.save(newPessoa);
            return new ResponseEntity<>(newPessoa, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public Pessoa post(@RequestBody Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        Optional<Pessoa> pessoa = this.repository.findById(id);
        if (pessoa.isPresent()) {
            this.repository.delete(pessoa.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
