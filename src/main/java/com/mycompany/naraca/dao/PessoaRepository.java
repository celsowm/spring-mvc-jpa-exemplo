/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.dao;

import com.mycompany.naraca.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Com a classe modelo 
//criada, o próximo passo é criar o repositório 
//(ou DAO: Data Access Object) que irá fornecer os métodos 
// para as operações CRUD. Uma forma fácil de fazer isso é criar uma interface 
//que extende a interface JpaRepository (do Spring Data):

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
    
}
