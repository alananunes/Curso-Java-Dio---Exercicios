package br.com.dio.collection.set;

import java.util.*;

public class ExemploSet {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]
    public static void main(String[] args) {
/*
O set não aceita valores repetidos e não tem indices
 */
        //Criando o array set
        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        //Verifica se existe um determinado elemento no array
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));

        //Menor valor do Array
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        //MAior valor do Array
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        //Exibir soma dos valores do array
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos elementos do array é: " + soma);

        // Exibir media
        System.out.println("Média dos valores: " + soma/ notas.size());

        //removendo valores
        System.out.println("Remova a nora 0: ");
        notas.remove(0);
        System.out.println(notas);

        //Remover valores menores q 7
        System.out.println("Remova as notas menores que 7 e exiba lista");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // exibir na prdem, não funciona com o hash set então vamos usar o linkedhashSet
        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //Ordenar
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        //apagando elementos do array
        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        //Verificando se array está vazio
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());

    }
}
