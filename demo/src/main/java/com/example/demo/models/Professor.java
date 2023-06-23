package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "professor")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_prof;

    @NotBlank
    @Size(max = 50)
    private String nome_prof;

    public Professor() {
    }

    public Professor(String nome_prof) {
        this.nome_prof = nome_prof;
    }

    public String getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(String nome_prof) {
        this.nome_prof = nome_prof;
    }
    
}
