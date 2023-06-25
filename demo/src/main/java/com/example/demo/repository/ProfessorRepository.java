package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{
    
}