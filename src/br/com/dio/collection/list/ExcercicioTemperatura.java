package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que receba a temperatua média dos 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram(mostrar mês por extenso: 1-Janeiro, etc)
 */
public class ExcercicioTemperatura {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Double> temperatura = new ArrayList<>();
        System.out.println("Informe a temperatura dos + primeiros meses em ordem de mês: ");

        int count = 0;
        while (count < 6){
            count++;
            double tempMedia = scan.nextDouble();
            temperatura.add(tempMedia);
        }
        System.out.println(temperatura);

        // Calculando o valor dos elementos da lista para descobrir a média
        Iterator<Double> iterator = temperatura.iterator();
        Double soma =0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        Double media =  soma/ temperatura.size();
        System.out.println("A média de temperatura dos 6 primeiros meses é: " + media);

        for (Double temperaturas: temperatura) {
            if (temperaturas > media ){
                int posicao = temperatura.indexOf(temperaturas);
                if(posicao == 0){
                    System.out.println("1- Janeiro: " + temperaturas);

                }else if(posicao == 1){
                    System.out.println("2- Fevereiro: " + temperaturas);
                }else if(posicao == 2){
                    System.out.println("3- Março: " + temperaturas);
                }else if(posicao == 3){
                    System.out.println("4- Abril: " + temperaturas);
                }else if(posicao == 4){
                    System.out.println("5- Maio: " + temperaturas);
                }else if(posicao == 5){
                    System.out.println("6- Junho: " + temperaturas);
                }

               // System.out.println(temperaturas);
               // System.out.println(temperatura.indexOf(temperaturas));
            }

        }
    }
}
