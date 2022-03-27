package br.com.dio.collection.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

      //  System.out.println("Imprima todos os elementos dessa lista de String: ");
       // numerosAleatorios.forEach(System.out::println);   ou
       //ou
      //  numerosAleatorios.stream()
            //     .forEach(System.out::println);

        System.out.println("-------------------");
       // System.out.println("Pegue os 5 primeiros números e coloque dentro de um set");

        /*Posso fazer dessa forma mandando já imprimir ou */
            //numerosAleatorios.stream()
                //    .limit(5)
               //     .collect(Collectors.toSet())
              //      .forEach(System.out::println);

        /*Posso fazer dessa forma jogando a collection na string */
      //  Set<String> collecSet = numerosAleatorios.stream()
                               //  .limit(5)
                              //   .collect(Collectors.toSet());

        /*-----------------------------------------------------------------------------------
        System.out.println("Transforme esta lista de String em uma lista de números inteiros");
            List<Integer>collectList = numerosAleatorios.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
         */
        /*--------------------------------------------------------------------------------
        System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista");
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter( i -> (i % 2 ==0  && i> 2))
                .collect(Collectors.toList());
         System.out.println(listParesMaiorQue2);

         */
        System.out.println("-----------------------------------------------------------------");
        /*
        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println) ;

         */
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Remova valores Impares: ");
        List<Integer>numerosAleatoriosImpares = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numerosAleatoriosImpares.removeIf(integer -> (integer % 2 !=0));
        System.out.println(numerosAleatoriosImpares);


    }
}
