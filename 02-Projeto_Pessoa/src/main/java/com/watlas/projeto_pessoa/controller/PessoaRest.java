package com.watlas.projeto_pessoa.controller;

import com.watlas.projeto_pessoa.dao.PessoaDao;
import com.watlas.projeto_pessoa.model.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoa")
public class PessoaRest {

    @Autowired
    private PessoaDao pessoaDao;

    @GetMapping
    public List<Pessoa> get(){
        return pessoaDao.findAll();
    }
    @PostMapping
    public void post(@RequestBody Pessoa pessoa){
        pessoaDao.save(pessoa);
    }
    @PutMapping
    public void put(@RequestBody Pessoa pessoa){
        pessoaDao.save(pessoa);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        pessoaDao.deleteById(id.longValue());
    }

}
