/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.prova;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Travessa","02","00","41181-270","Salvador", UnidadeFederativa.BAHIA);
        Medico medico = new Medico("515151","99859548","5151515","515518848", Setor.SAUDE, 1000, LocalDate.of(2000, Month.JULY, 20), Genero.MASCULINO,"Martina","985848-5254","Martina@gmail.com", endereco);
        Advogado advogado = new Advogado("8487887848","84881814","55518181","151581881", Setor.ENGENHARIA, 555, LocalDate.of(1985, Month.MARCH, 20), Genero.MASCULINO,"Lucas","995956-9999","Lucasadvocacia@gmail.com", endereco);
       Motoboy motoboy = new Motoboy("772661515","15115151","1551551","51515115", Setor.OPERERACOES, 500, LocalDate.of(2000, Month.MAY, 8), Genero.MASCULINO,"Alberto","99999-9999","Albertoentregas@gmail.com", endereco);
       Pessoa pessoa = new Pessoa("Icaro Sena","(71) 99654-1056","Icarogames200@gmail.com",endereco);
        Funcionario funcionario = new Funcionario("484.656.025-50","8888888-888","69242469", Setor.SAUDE, 21215, LocalDate.of(-401, Month.APRIL, 4), Genero.MASCULINO,"Gustavo","(44) 99964-6924","guga@gmail.com", endereco) {};
        
        
        System.out.println(endereco.toString());
        System.out.println(pessoa.toString());
        System.out.println(funcionario.toString());
        System.out.println(medico.toString());
        System.out.println(advogado.toString());
        System.out.println(motoboy.toString());
        }
    }

