package br.com.dio.arrays;

import javax.swing.*;
import java.util.Scanner;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6]; // um array é um objeto

        int count = 0;
        int qtdConsoantes = 0;

        do {
            System.out.println("Informe a letra");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){

                consoantes[count] = letra;
                qtdConsoantes++;


            }
            count++;
        }while (count < consoantes.length);

        System.out.print("Consoantes: ");
        for (String consoante : consoantes ) {
            if(consoante != null)
            System.out.print(consoante + " ");

        }

        System.out.print("\nA quantidade de consoantes é: " + qtdConsoantes);

    }
}
