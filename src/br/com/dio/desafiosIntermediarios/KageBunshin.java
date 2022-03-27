package br.com.dio.desafiosIntermediarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KageBunshin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdNinjas;
        List<Integer> ninjas = new ArrayList<>();
        qtdNinjas = sc.nextInt();
        ninjas.add(qtdNinjas);
       // System.out.println(ninjas.toString());

        while (sc.hasNext()){
            System.out.println((int) (qtdNinjas / 2));
        }



    }
}
