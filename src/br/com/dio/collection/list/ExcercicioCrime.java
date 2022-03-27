package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*

 */
public class ExcercicioCrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        int count =0;
        String resp = scan.nextLine();
        System.out.println("Telefonou para a vítima?");
        respostas.add(resp.toLowerCase());

        System.out.println("Esteve no local do crime?");
        respostas.add(resp.toLowerCase());

        System.out.println("Mora Perto da vítima?");
        respostas.add(resp.toLowerCase());;

        System.out.println("Devia para a vítima?");
        respostas.add(resp.toLowerCase());

        System.out.println("Já trabalhou com a vítima?");
        respostas.add(resp.toLowerCase());

        System.out.println(respostas);

        Iterator<String> iterator = respostas.iterator();
        int somaSim = 0;
        int somaNao = 0;
        while (iterator.hasNext()){
            String next = iterator.next();
            if(next.equalsIgnoreCase("s") ){
                somaSim++;
            }else  if(next.equalsIgnoreCase("n") ){
                somaNao++;
            }
        }
        if(somaSim == 2){
            System.out.println("Suspeita");
        }else if(somaSim == 3 || somaSim == 4){
            System.out.println("Cúmplice");
        }else if(somaSim == 5){
            System.out.println("Assassina");
        }else{
            System.out.println("Inocente");
        }




    }
}
