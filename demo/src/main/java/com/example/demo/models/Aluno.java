package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "aluno")

public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer matricula;

    @NotBlank
    @Size(max = 50)
    private String nome_aluno;

    @NotBlank
    @Size(max = 50)
    private String curso;

    public Aluno() {
    }

    public Aluno(String nome_aluno, String curso) {
        this.nome_aluno = nome_aluno;
        this.curso = curso;
    }

    public String getNome_aluno() {
    return nome_aluno;
    }

    public void setNome_aluno(String nome_aluno) {
        this.nome_aluno = nome_aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }    
    
}
