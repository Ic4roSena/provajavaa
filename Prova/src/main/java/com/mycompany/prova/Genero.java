/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    private final String texto;
    private final char character;

    private Genero(String texto, char character) {
        this.texto = texto;
        this.character = character;
    }

    public String getTexto() {
        return texto;
    }

    public char getCharacter() {
        return character;
    }
    
    
}
