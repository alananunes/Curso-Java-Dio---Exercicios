package br.com.dio.loops;

import java.util.Scanner;

public class Ex1_NomeIdade {
    /*
    * Faça um programa que leia conjuntos de dois valores,
    * O primeiro representando o nome do aluno e o segundo sua idade.
    * Pare o programa inserindo o valor 0 no campo nome
    * */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;


        while (true){

            System.out.println("Informe o nome: ");
            nome = scan.next();

            if (nome.equals("0")) break;

            System.out.println("Informe a idade: ");
            //idade = scan.nextInt();

        }

    }
}
