package com.watlas.projeto_pessoa.dao;

import com.watlas.projeto_pessoa.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz virar dao
public interface PessoaDao extends JpaRepository<Pessoa, Long>  {

}
