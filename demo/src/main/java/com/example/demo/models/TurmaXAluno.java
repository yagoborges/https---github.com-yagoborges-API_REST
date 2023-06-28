package com.example.demo.models;

import java.io.Serializable;

import jakarta.persistence.*;


@Entity
@Table(name = "turma_x_aluno")
public class TurmaXAluno implements Serializable{
    
    @EmbeddedId
    private TurmaXAlunoId id = new TurmaXAlunoId();
    
    //@MapsId("consultantId")
   //@JoinColumn(insertable = false, updatable = false)
    @ManyToOne
    @MapsId("matricula")
    //@JoinColumn(insertable = false, updatable = false)
    private Aluno fk_txa_matricula;

    @ManyToOne
    @MapsId("cod_turma")
    //@JoinColumn(insertable = false, updatable = false)
    private Turma fk_txa_cod_turma;

    public TurmaXAluno(){
    }

    public TurmaXAluno(Aluno fk_txa_matricula, Turma fk_txa_cod_turma) {
        this.fk_txa_matricula = fk_txa_matricula;
        this.fk_txa_cod_turma = fk_txa_cod_turma;
    }

    public Aluno getFk_txa_matricula() {
        return fk_txa_matricula;
    }

    public void setFk_txa_matricula(Aluno fk_txa_matricula) {
        this.fk_txa_matricula = fk_txa_matricula;
    }

    public Turma getFk_txa_cod_turma() {
        return fk_txa_cod_turma;
    }

    public void setFk_txa_cod_turma(Turma fk_txa_cod_turma) {
        this.fk_txa_cod_turma = fk_txa_cod_turma;
    }



    
}
