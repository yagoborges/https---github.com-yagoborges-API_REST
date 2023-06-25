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

import com.example.demo.models.Turma;
import com.example.demo.repository.TurmaRepository;

@RestController
@RequestMapping(value = "/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository repository;

    @GetMapping
    public ResponseEntity<List<Turma>> listarTurmas(){
        List<Turma> turmas = repository.findAll();
        return ResponseEntity.ok(turmas);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        Optional<Turma> turma = repository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(turma.get());
    }

    @PostMapping
    public void salvar(@RequestBody Turma turma) {
        repository.save(turma);
    }

    @PutMapping
    public void editar(@RequestBody Turma turma) {
        if (turma.getCod_turma() > 0) {
            repository.save(turma);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    
}
