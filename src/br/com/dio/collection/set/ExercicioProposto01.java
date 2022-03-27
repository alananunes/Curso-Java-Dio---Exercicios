package br.com.dio.collection.set;

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {

        //A: Exiba todas as cores uma abaixo da outra
        System.out.println("----------\tCores do ArcoIris\t--------------");
        Set<String> meuArcoIris = new HashSet<>
                (Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        int count =0;
        for (String arcoIris:meuArcoIris) {
            count++;
            System.out.println(arcoIris);
        }
        System.out.println("");
        //B: A quantidade de cores que o arco-iris tem
        //forma 01:
        System.out.println("----------\tQuantidade de Cores\t--------------");
        System.out.println("A quantidade de cores do Arco Iris é: " + count);

        //forma 02
        //Exibir soma dos valores do array
        System.out.println("A quantidade de cores do Arco Iris é: " + meuArcoIris.size());;
        System.out.println("");
        //C: Exiba as cores em ordem alfabetica
        System.out.println("----------\tCores em Ordem Alfábetica\t--------------");
        Set<String> meuArcoIris2 = new TreeSet<>(meuArcoIris);

        System.out.println(meuArcoIris2);

        System.out.println("");
        //D: Exiba as cores na ordem inversa da que foi informada
        System.out.println("----------\tCores em Ordem Inversa do que foi informada\t--------------");
        System.out.println("Exiba as cores na ordem inversa da que foi informada ");
        Set<String> meuArcoIris3 = new LinkedHashSet
                (Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println(meuArcoIris3);
        List<String> coresArcoIrisList = new ArrayList(meuArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);

        System.out.println("");
        //E: Exiba todas as cores que começam com a letra "V"
        System.out.println("----------\tCores que começam com a letra V\t--------------");
        Iterator iterator2 = meuArcoIris2.iterator();

        while(iterator2.hasNext()) {
            String cor = (String) iterator2.next();
            if (cor.startsWith("v")) {
                System.out.println(cor);
            }
        }

            System.out.println("");
            //F: Remova todas as cores que começam com a letra "V"
            System.out.println("----------\tCores que começam com a letra V\t--------------");
            Iterator iterator3 = meuArcoIris2.iterator();

            while(iterator3.hasNext()) {
                String cor1 = (String)iterator3.next();
                if (cor1.startsWith("v")) {
                    iterator3.remove();
                }
        }
                 System.out.println(meuArcoIris2);

        //G: Limpe o conjunto
        System.out.println("----------\tLimpe o array de cores\t--------------");
        meuArcoIris2.clear();
        System.out.println("");
        //H: Confira se está vazio
        System.out.println("----------\tConferir se array está vazio\t--------------");
        System.out.println(meuArcoIris2.isEmpty());

    }
}
