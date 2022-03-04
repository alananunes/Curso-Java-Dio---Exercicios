package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números
 */
public class Ex3_MAiorMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        int count =0;
        int maior = 0;
        double media = 0;

        do{
            System.out.println("Digite o número");
            numero = scan.nextInt();
            if (numero > maior){
                maior = numero;
            }

            count = count + 1;
            media = media + numero;
        }while(count < 5);
        System.out.println("quantidade de numeros: " + count);
        System.out.println("O maior número é : " + maior);
        System.out.println("A média dos números é: " + media/count);



    }
}
