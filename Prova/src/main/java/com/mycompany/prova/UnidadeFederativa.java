/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.prova;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Bahia","BA"),
    RIODEJANEIRO("Rio de Janeiro","RJ"),
    SAOPAULO("São Paulo","SP");
    
    private final String UnidadeFederativa;
    private final String Sigla;
        

    private UnidadeFederativa(String UnidadeFederativa, String Sigla) {
        this.UnidadeFederativa = UnidadeFederativa;
        this.Sigla = Sigla;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getRIODEJANEIRO() {
        return RIODEJANEIRO;
    }

    public static UnidadeFederativa getSAOPAULO() {
        return SAOPAULO;
    }

    public String getUnidadeFederativa() {
        return UnidadeFederativa;
    }

    public String getSigla() {
        return Sigla;
    }



    
    
}
