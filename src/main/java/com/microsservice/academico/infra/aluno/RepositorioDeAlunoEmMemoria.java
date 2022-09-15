package com.microsservice.academico.infra.aluno;

import com.microsservice.academico.dominio.aluno.Aluno;
import com.microsservice.academico.dominio.aluno.Cpf;
import com.microsservice.academico.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Aluno> listarTodosAlunoMatriculados() {
        return this.matriculados;
    }
}
