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
public class Cliente extends Física{
 private int protocoloatedimento;

    public Cliente(int protocoloatedimento, LocalDate datanascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(datanascimento, genero, nome, telefone, email, endereco);
        this.protocoloatedimento = protocoloatedimento;
    }

    public int getProtocoloatedimento() {
        return protocoloatedimento;
    }

    public void setProtocoloatedimento(int protocoloatedimento) {
        this.protocoloatedimento = protocoloatedimento;
    }

    @Override
    public String toString() {
        return super.toString()+" Protocolo Atedimento=" + protocoloatedimento;
    }

    
 
}
