package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "disciplina")

public class Disciplina {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_disc;

    @NotBlank
    @Size(max = 50)
    private String nome_disc;

    @ManyToOne
    @JoinColumn(name = "cod_prof")
    private Professor fk_cod_prof;

    public Disciplina() {
    }

    public Disciplina(String nome_disc, Professor fk_cod_prof) {
        this.nome_disc = nome_disc;
        this.fk_cod_prof = fk_cod_prof;
    }

    public String getNome_disc() {
        return nome_disc;
    }

    public Professor getFk_cod_prof() {
        return fk_cod_prof;
    }

    public void setNome_disc(String nome_disc) {
        this.nome_disc = nome_disc;
    }

    public void setFk_cod_prof(Professor fk_cod_prof) {
        this.fk_cod_prof = fk_cod_prof;
    }
    
    public Long getCod_disc() {
        return cod_disc;
    }
}

