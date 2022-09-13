package com.microsservice.academico.escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Cpf cpf;
    private String nome;
    private Email email;
    private Indicacao indicacao;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }

}
