package br.com.dio.desafiosIntermediarios;

import java.util.*;

public class OrdanandoNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe Quantidades de números que serão informados: ");
        int qtdNumeros = scan.nextInt();
        int count = 0;
         System.out.println("Informe " + qtdNumeros +" valores Inteiros positivos");
       // int numeros = scan.nextInt();

        List<Integer> numerosPositivos = new ArrayList<>();
        while(count < qtdNumeros){
            count++;
            int numeros = scan.nextInt();
            numerosPositivos.add(numeros);

        }
        Collections.sort(numerosPositivos);

        for (Integer numPositivos:numerosPositivos) {
            if (numPositivos % 2 == 0){
             System.out.println(numPositivos);
            }

        }
        Collections.reverse(numerosPositivos);
        for (Integer numPositivos:numerosPositivos) {
            if (numPositivos % 2 != 0){
                System.out.println(numPositivos);
            }

        }

    }

}
