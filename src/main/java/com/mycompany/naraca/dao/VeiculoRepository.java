/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.naraca.dao;

import com.mycompany.naraca.model.Veiculo;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {

    //@EntityGraph(value = "Pessoa.veiculos", type = EntityGraphType.FETCH)
    @Query("from Veiculo v where v.proprietario.id = ?1")
    public Set<Veiculo> findAllByPessoaId(int pessoa_id);

}
