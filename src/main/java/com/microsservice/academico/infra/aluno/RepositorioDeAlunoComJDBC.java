package com.microsservice.academico.infra.aluno;

import com.microsservice.academico.dominio.aluno.Aluno;
import com.microsservice.academico.dominio.aluno.Cpf;
import com.microsservice.academico.dominio.aluno.RepositorioDeAlunos;
import com.microsservice.academico.dominio.aluno.Telefone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class RepositorioDeAlunoComJDBC implements RepositorioDeAlunos {

    private final Connection connection;

    public RepositorioDeAlunoComJDBC(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void matricular(Aluno aluno) {
        String sql = "INSERT INTO ALUNO VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,aluno.getCpf());
            preparedStatement.setString(2,aluno.getNome());
            preparedStatement.setString(3,aluno.getEmail());
            preparedStatement.execute();

            sql = "INSERT INTO TELEFONE VALUES (?,?)";
            preparedStatement = connection.prepareStatement(sql);
             for (Telefone telefone : aluno.getTelefones()){
                 preparedStatement.setString(1,telefone.getDd());
                 preparedStatement.setString(2,telefone.getNumero());
                 preparedStatement.execute();
             }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Aluno buscarPorCpf(Cpf cpf) {
        return null;
    }

    @Override
    public List<Aluno> listarTodosAlunoMatriculados() {
        return null;
    }
}
