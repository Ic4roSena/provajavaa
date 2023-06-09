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
public class Medico extends Funcionario{
     private String crm;

    public Medico(String crm, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate datanascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, datanascimento, genero, nome, telefone, email, endereco);
        this.crm = crm;
    }
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Credencial de Médicina: " + crm;
    }
     
     
}
