package com.example.demo.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "turma")

public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cod_turma;

    @ManyToOne
    @JoinColumn(name = "cod_disc")
    private Disciplina fk_cod_disc;

    @NotBlank
    @Size(max = 50)
    private String anosem;

    @OneToMany
    private List<TurmaXAluno> alunosPorTurma = new ArrayList<>();

    public Turma() {
    }

    public Turma(Disciplina fk_cod_disc, String anosem) {
        this.fk_cod_disc = fk_cod_disc;
        this.anosem = anosem;
    }

    public Disciplina getFk_cod_disc() {
        return fk_cod_disc;
    }

    public String getAnosem() {
        return anosem;
    }

    public void setFk_cod_disc(Disciplina fk_cod_disc) {
        this.fk_cod_disc = fk_cod_disc;
    }

    public void setAnosem(String anosem) {
        this.anosem = anosem;
    }

    public Long getCod_turma() {
        return cod_turma;
    }

    public void add(TurmaXAluno ta) {
      ta.setFk_txa_cod_turma(this);
      this.alunosPorTurma.add(ta);
   }
}
