/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saude"),
    JURIDICO("Juridico"),
    OPERERACOES("Operacoes");
    
    private final String setor;

    private Setor(String setor) {
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }
    
    
}
