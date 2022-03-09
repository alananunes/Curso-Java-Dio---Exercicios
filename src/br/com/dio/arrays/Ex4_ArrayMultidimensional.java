package br.com.dio.arrays;

import java.util.Random;

/*
Gere e imprima uma matriz M 4X4 com valores aleatorios entre 0-9
 */
public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizAleatoria = new int[4][4];

        for (int i = 0; i<matrizAleatoria.length; i++){
            for (int j = 0; j < matrizAleatoria[i].length; j++){
               matrizAleatoria[i][j] = random.nextInt(9);

            }

        }
        System.out.println("Matriz: ");
        for (int[] linha : matrizAleatoria ) {
            for (int coluna : linha ) {
                System.out.print(coluna + " ");

            }
            System.out.println();

        }

    }
}
