package com.microsservice.academico.escola;

public class Email {
    private String endereco;


    public Email(String endereco){
        if(emailIsValide()){
            this.endereco = endereco;
        }
        throw new IllegalArgumentException("Email Invalido");
    }
    private boolean emailIsValide(){
        return this.endereco == null ||
                this.endereco.
                        matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i");
    }
}
