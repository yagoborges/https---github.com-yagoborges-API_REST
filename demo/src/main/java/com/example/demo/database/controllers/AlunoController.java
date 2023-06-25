package com.example.demo.database.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Aluno;
import com.example.demo.repository.AlunoRepository;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @GetMapping
    public ResponseEntity<List<Aluno>> listarAlunos(){
        List<Aluno> alunos = repository.findAll();
        return ResponseEntity.ok(alunos);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        Optional<Aluno> aluno = repository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(aluno.get());
    }

    @PostMapping
    public void salvar(@RequestBody Aluno aluno) {
        repository.save(aluno);
    }

    @PutMapping
    public void editar(@RequestBody Aluno aluno) {
        if (aluno.getMatricula() > 0) {
            repository.save(aluno);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    
}
