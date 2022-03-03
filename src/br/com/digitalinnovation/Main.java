package br.com.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));//False
        System.out.println("b1 && b3: " + (b1 && b3));//true

        System.out.println("b2 || b3: " + (b2 || b3)); //true
        System.out.println("b2 || b4: " + (b2 || b4)); // false

        System.out.println("b1 ^ b3: " + (b1 ^ b3)); // false
        System.out.println("b4 ^ b1: " + (b4 ^ b1)); // true

        System.out.println("!b1: " + (!b1)); // false
        System.out.println("!b2: " + (!b2)); // true

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;
        System.out.println("((i1 + i2) < (f2 - f1)) && true => " + (((i1 + i2) < (f2 - f1)) && true)); // 15 < 30 (True) &&true = true
        System.out.println("((i1 > i2) || (f2 < f1)) => " + ((i1 > i2) || (f2 < f1)));

        System.out.println("#####################Estrutura de decisão#####################################");
        //ControleFluxoDecisao.ifFlecha();
      //  ControleFluxoDecisao.ifSemFlecha();
    }
}
