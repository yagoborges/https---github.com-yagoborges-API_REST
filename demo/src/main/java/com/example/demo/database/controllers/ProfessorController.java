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

import com.example.demo.models.Professor;
import com.example.demo.repository.ProfessorRepository;

@RestController
@RequestMapping(value = "/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository repository;

    @GetMapping
    public ResponseEntity<List<Professor>> listarProfessores(){
        List<Professor> professores = repository.findAll();
        return ResponseEntity.ok(professores);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        Optional<Professor> professor = repository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(professor.get());
    }

    @PostMapping
    public void salvar(@RequestBody Professor professor) {
        repository.save(professor);
    }

    @PutMapping
    public void editar(@RequestBody Professor professor) {
        if (professor.getCod_prof() > 0) {
            repository.save(professor);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    
}
