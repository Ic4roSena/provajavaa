/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Física extends Pessoa{
   protected LocalDate datanascimento;
   protected Genero genero;

    public Física(LocalDate datanascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.datanascimento = datanascimento;
        this.genero = genero;
    }   
   public int getIdade(){
       return Period.between(datanascimento,LocalDate.now()).getYears();
   }

    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "\n Data nascimento: " + datanascimento + 
                "\n Genero: " + genero;
    }
   
}
