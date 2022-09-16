package com.microsservice.academico.aplicacao.aluno.matricular;

import com.microsservice.academico.dominio.aluno.Aluno;
import com.microsservice.academico.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }
    public void matricular(MatricularAlunoDto dados){
        Aluno aluno = dados.criarAluno();
        repositorio.matricular(aluno);
    }
}
