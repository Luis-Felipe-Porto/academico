package com.microsservice.academico.aplicacao.indicacao;

import com.microsservice.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
