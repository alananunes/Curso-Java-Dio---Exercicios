package br.com.dio.loops;

import java.util.Scanner;

public class Ex2_Nota {

    /*
     *Faça um programa que peça uma nota entre zero e dez.
     *Mostre uma mensagem caso o valor seja inválido
     *e continue pedindo até que o usuário informe um valor válido.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("Informe uma nota");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Informe uma nota válida");
            nota = scan.nextInt();

        }

    }
}
