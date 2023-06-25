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

import com.example.demo.models.Disciplina;
import com.example.demo.repository.DisciplinaRepository;

@RestController
@RequestMapping(value = "/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository repository;

    @GetMapping
    public ResponseEntity<List<Disciplina>> listarDisciplinas(){
        List<Disciplina> disciplinas = repository.findAll();
        return ResponseEntity.ok(disciplinas);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
        Optional<Disciplina> disciplina = repository.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(disciplina.get());
    }

    @PostMapping
    public void salvar(@RequestBody Disciplina disciplina) {
        repository.save(disciplina);
    }

    @PutMapping
    public void editar(@RequestBody Disciplina disciplina) {
        if (disciplina.getCod_disc() > 0) {
            repository.save(disciplina);
        }
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }

    
}
