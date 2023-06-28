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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.TurmaXAluno;
import com.example.demo.repository.TurmaXAlunoRepository;

@RestController
@RequestMapping(value = "/addaluno")
public class TurmaXAlunoController {

    @Autowired
    private TurmaXAlunoRepository repository;

    @GetMapping
    public ResponseEntity<List<TurmaXAluno>> listarAlunosDaTurma(){
        List<TurmaXAluno> turmaXAlunos = repository.findAll();
        return ResponseEntity.ok(turmaXAlunos);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        //Optional<TurmaXAluno> turmaXAluno = repository.findById(id);
       //return ResponseEntity.status(HttpStatus.OK).body(turmaXAluno.get());
       return null;
    }

    @PostMapping
    public void salvar(@RequestBody TurmaXAluno turmaXAluno) {
        repository.save(turmaXAluno);
    }

    /*@PutMapping
    public void editar(@RequestBody TurmaXAluno turmaXAluno) {
        if (turmaXAluno.getMatricula() > 0) {
            repository.save(turmaXAluno);
        }
    }*/

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        //repository.deleteById(id);
    }

    @GetMapping("/buscarT/{id}")
    public ResponseEntity<Object> buscarPorIdTurmaAlunoID(@PathVariable Long id) {
        List<TurmaXAluno> turmaXAlunos = repository.findAll();
        return ResponseEntity.ok(turmaXAlunos.get(0));
    }
    
}
