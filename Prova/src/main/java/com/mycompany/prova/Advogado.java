/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario{
     private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate datanascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, datanascimento, genero, nome, telefone, email, endereco);
        this.oab = oab;
    }
    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Certificado de Advocacia: " + oab;
    }
     
     
}
