package com.microsservice.academico.dominio.aluno;

public class Email {
    private String endereco;


    public Email(String endereco){
        if(emailIsValide()){
            this.endereco = endereco;
        }
        throw new IllegalArgumentException("Email Invalido");
    }

    public String getEndereco() {
        return endereco;
    }

    private boolean emailIsValide(){
        return this.endereco == null ||
                this.endereco.
                        matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i");
    }
}
