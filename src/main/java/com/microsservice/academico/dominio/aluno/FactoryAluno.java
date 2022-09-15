package com.microsservice.academico.dominio.aluno;

public class FactoryAluno {
    private Aluno aluno;

    public FactoryAluno comNomeCpfEmail(String nome, String cpf, String email){
        this.aluno = new Aluno(new Cpf(cpf),nome,new Email(email));
        return this;
    }
    public FactoryAluno comTelefone(String ddd, String numero){
        this.aluno.adicionarTelefone(new Telefone(ddd,numero));
        return this;
    }
}
