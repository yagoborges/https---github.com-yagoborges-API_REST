package com.example.demo.models;



import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class TurmaXAlunoId implements Serializable {
    
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((cod_turma == null) ? 0 : cod_turma.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TurmaXAlunoId other = (TurmaXAlunoId) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (cod_turma == null) {
            if (other.cod_turma != null)
                return false;
        } else if (!cod_turma.equals(other.cod_turma))
            return false;
        return true;
    }

    
}
