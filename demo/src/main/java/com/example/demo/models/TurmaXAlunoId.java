package com.example.demo.models;



import jakarta.persistence.Embeddable;

@Embeddable
public class TurmaXAlunoId{
    

    private Long matricula;
    private Long cod_turma;
    

    public TurmaXAlunoId() {
    }
    
    public TurmaXAlunoId(Long matricula, Long cod_turma) {
        this.matricula = matricula;
        this.cod_turma = cod_turma;
    }

    public Long getMatricula() {
        return matricula;
    }
    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }
    public Long getCod_turma() {
        return cod_turma;
    }
    public void setCod_turma(Long cod_turma) {
        this.cod_turma = cod_turma;
    }

    
}
