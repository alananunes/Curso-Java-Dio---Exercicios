package br.com.dio.loops;

import java.util.Scanner;
/*
Faça um for que mostre os números de 3 até 11. sendo que intere de 2 em 2.
Entretanto, quando o loop passar pelo 7, este não deve ser exibido.
 */
public class Ex7_Exceto7 {
    public static void main(String[] args) {
       for (int i = 3; i <= 11; i = i + 2){

           if(i != 7){
               System.out.println(i + " ");

           }

       }


    }
}
