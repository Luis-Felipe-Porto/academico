package com.microsservice.academico.escola;

public class Cpf {
    private String numero;

    public Cpf(String numero){
        if(cpfIsValid(numero)){
            this.numero = numero;
        }
        throw new IllegalArgumentException("Cpf inválido");
    }
    private boolean cpfIsValid(String numero){
        return numero == null ||
                numero.
                matches("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})\n");
    }
}
