package br.com.dio.arrays;

import java.util.Random;
import java.util.Scanner;

/*
Faça um programa que leia 20 números inteiros aleatórios(entre 0 e 100) e armazene-os em um vetor
Ao final os números e seus sucessores
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];
        int count =0;

      for(int i = 0; i < numAleatorios.length; i++){
          int numero = random.nextInt(100);
          numAleatorios[i]= numero;
        }
        System.out.println("Números Aleatórios: ");
        for (int numAleatorio:numAleatorios) {
            System.out.print(numAleatorio + " ");

        }

        System.out.println("\nSucessores Números Aleatórios: ");
        for (int numAleatorio:numAleatorios) {
            System.out.print("O sucessor de: " + numAleatorio + " é " + (numAleatorio + 1));

        }

        System.out.println("\nAntecessores Números Aleatórios: ");
        for (int numAleatorio:numAleatorios) {
            System.out.print("O sucessor de: " + numAleatorio + " é " + (numAleatorio - 1));

        }
    }

}
