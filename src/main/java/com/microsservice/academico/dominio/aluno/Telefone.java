package com.microsservice.academico.dominio.aluno;

public class Telefone {
    private String dd;
    private String numero;

    public Telefone(String dd, String numero) {
        this.dd = dd;
        this.numero = numero;
    }

    public String getDd() {
        return dd;
    }

    public String getNumero() {
        return numero;
    }
}
