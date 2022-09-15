package com.microsservice.academico.dominio.indicacao;

import com.microsservice.academico.dominio.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {
    private Aluno indicado;
    private Aluno indicante;

    private LocalDateTime localDateTime;

    public Indicacao(Aluno indicado, Aluno indicante, LocalDateTime localDateTime) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.localDateTime = localDateTime;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
