package com.microsservice.academico.aplicacao;

import com.microsservice.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno indicado);
}
