package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    
}
