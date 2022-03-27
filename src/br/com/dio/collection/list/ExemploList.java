package br.com.dio.collection.list;

import com.sun.source.tree.WhileLoopTree;

import java.util.*;

public class ExemploList {
    // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6]
    public static void main(String[] args) {
        //List notas = new ArrayList<>();

        //Criando list
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0.0);
        notas.add(3.6);
        // toString => mostrando a list criada
        System.out.println(notas.toString());

        //indexOf => mostra a posição do elemento na lista
        System.out.println("Exiba a posição da nota 5.0 " + notas.indexOf(5d));

        //add => adiciona elemento, mas nesse caso indico a posição que ele vai ser adicionado
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.d);
        System.out.println(notas);

        // set => substituir elemento em determinada posição
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d );
        System.out.println(notas);

        //contains => verifica se o elemento está na list
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        //Por ser uma lista já é exibido conforme ordem que foi inserido
        System.out.println("Exiba todas as notas na ordem em que foram informadados: ");
        for (Double nota : notas) System.out.println(nota);

        // get => passamos a posição do elemento e ele nos mostra quem é o elemento dessa posção:
        System.out.println("Exiba a terceira nota adicionada : "+ notas.get(2));
        System.out.println(notas.toString());

        //
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        //interetor tem proximo?
        // se tiver ele joga o valor dentro da variavel next e vai somando esses valores na variavel soma. O iteretar age como se fosse o cursor
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        //size => retorna a qunatidade de elementos da lista;
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // remove a nota informada
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // remove a nota da posição informada
        System.out.println("Remova a nota na posição 0: ");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7){
                iterator1.remove();
            }
        }
        System.out.println(notas);

        //clear => apaga a lista
        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        //isEmpty => retorna true se estiver vazia e false se não estiver vazia
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());









    }
}
