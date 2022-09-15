package com.microsservice.academico.dominio;

import com.microsservice.academico.dominio.aluno.Email;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    @DisplayName("Nao deve criar email com endereco invalidos")
    void testCriarEmail(){
        assertThrows(IllegalArgumentException.class,()-> new Email(null));
        assertThrows(IllegalArgumentException.class,()-> new Email(""));
        assertThrows(IllegalArgumentException.class,()-> new Email("email invalido"));
    }

}