package br.com.dio;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        double numero1 = 10;
        double numero2 = 5;
        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);


        //Mensagem
        System.out.println("##################################################################################");
        System.out.println("Exercío Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        //Mensagem
        System.out.println("##################################################################################");
        System.out.println("Exercío Emprestimo");
        Emprestimo.calculaEmprestimo(200, Emprestimo.getDuasParcelas());
        Emprestimo.calculaEmprestimo(500, Emprestimo.getTresParcelas());
        Emprestimo.calculaEmprestimo(100, 5);


    }






}
