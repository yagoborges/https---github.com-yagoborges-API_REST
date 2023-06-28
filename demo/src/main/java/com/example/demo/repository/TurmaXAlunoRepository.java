package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.TurmaXAluno;
import com.example.demo.models.TurmaXAlunoId;

public interface TurmaXAlunoRepository extends JpaRepository<TurmaXAluno, TurmaXAlunoId>{
    
}
