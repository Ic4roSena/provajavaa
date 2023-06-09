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
public class Motoboy extends Funcionario{
    private String cnh;

    public Motoboy(String cnh, String cpf, String rg, String matricula, Setor setor, double salario, LocalDate datanascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, datanascimento, genero, nome, telefone, email, endereco);
        this.cnh = cnh;
    }
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Carteira Nacional de Habilitação: " + cnh;
    }
    
    
}
