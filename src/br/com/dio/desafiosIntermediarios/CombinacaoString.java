package br.com.dio.desafiosIntermediarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinacaoString {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de casos");
        int n = Integer.parseInt(scan.nextLine());

        for(int i = 1; i <= n; i++) {

            StringBuilder novaPalavra = new StringBuilder();
            String[] palavras = scan.nextLine().split(" ");

            int tamanho = Math.max(
                    palavras[0].length(),
                    palavras[1].length());

            for(int j = 0; j < tamanho; j++) {

                if(j < palavras[0].length()) {
                    novaPalavra.append(palavras[0].charAt(j));
                }

                if(j < palavras[1].length()) {
                    novaPalavra.append(palavras[1].charAt(j));
                }
            }


            System.out.println(novaPalavra.toString());

            /*
                : Concatenação de Strings com método append.

                StringBuilder nomes = new StringBuilder();
                nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");

                System.out.println(nomes.toString());
             */

        }
    }

}
