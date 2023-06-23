package com.example.demo.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "turma")

public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cod_turma;

    @NotBlank
    private Integer fk_cod_prof;

    @NotBlank
    private Integer fk_cod_disc;

    @NotBlank
    @Size(max = 50)
    private String anosem;

    public Turma() {
    }

    public Turma(Integer fk_cod_prof, Integer fk_cod_disc, String anosem) {
        this.fk_cod_prof = fk_cod_prof;
        this.fk_cod_disc = fk_cod_disc;
        this.anosem = anosem;
    }

    public Integer getFk_cod_prof() {
        return fk_cod_prof;
    }

    public void setFk_cod_prof(Integer fk_cod_prof) {
        this.fk_cod_prof = fk_cod_prof;
    }

    public Integer getFk_cod_disc() {
        return fk_cod_disc;
    }

    public void setFk_cod_disc(Integer fk_cod_disc) {
        this.fk_cod_disc = fk_cod_disc;
    }
    
    public String getAnosem() {
        return anosem;
    }

    public void setAnosem(String anosem) {
        this.anosem = anosem;
    }

}
