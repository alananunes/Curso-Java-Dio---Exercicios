package br.com.dio.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares
 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, qtdNum;
        int count = 0;
        int numPar = 0;
        int numImpar = 0;

        System.out.println("Informe a quantidade de numeros");
        qtdNum = scan.nextInt();

        do{
            System.out.println("Informe um número");
            numero = scan.nextInt();
            if(numero % 2 == 0){
                numPar = numPar +1;
            }else{
                numImpar = numImpar + 1;
            }

            count = count + 1;
        }while(count < qtdNum);

        System.out.println("A quantida de números pares é : " + numPar);
        System.out.println("A quantida de números impares é : " + numImpar);
    }
}
