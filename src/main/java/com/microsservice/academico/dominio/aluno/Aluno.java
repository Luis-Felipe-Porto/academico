package com.microsservice.academico.dominio.aluno;

import com.microsservice.academico.dominio.indicacao.Indicacao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private Cpf cpf;
    private String nome;
    private Email email;
    private Indicacao indicacao;
    private List<Telefone> telefones = new ArrayList<>();
    private String senha;

    public Aluno(Cpf cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email.getEndereco();
    }

    public Indicacao getIndicacao() {
        return indicacao;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }
}
