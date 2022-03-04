package br.com.dio.tiposdadosoperacoesarit;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        double numero1 = 10;
        double numero2 = 5;
        Calculadora.soma(numero1, numero2);
        Calculadora.subtracao(numero1, numero2);
        Calculadora.multiplicacao(numero1, numero2);
        Calculadora.divisao(numero1, numero2);


        //Mensagem
        System.out.println("##################################################################################");
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        //Mensagem
        System.out.println("####################################################################################");
        System.out.println("Exercício Emprestimo");
        Emprestimo.calculaEmprestimo(200, Emprestimo.getDuasParcelas());
        Emprestimo.calculaEmprestimo(500, Emprestimo.getTresParcelas());
        Emprestimo.calculaEmprestimo(100, 5);


        //Mensagem
        System.out.println("####################################################################################");
        System.out.println("Exercício Quadrilatero");
        Quadrilatero.area(3);
        Quadrilatero.area(5,5);
        Quadrilatero.area(7,8,9);


        //Mensagem
        System.out.println("####################################################################################");
        System.out.println("Exercício Quadrilatero com Retorno");
        double areaQuadradro = QuadrilateroRetorno.area(3);
        System.out.println("A área do Quadrado é: " + areaQuadradro);
        double areaRetangulo = QuadrilateroRetorno.area(5, 5);
        System.out.println("A área do Retângulo é: " + areaRetangulo);
        double areaTrapezio = QuadrilateroRetorno.area(7,8,9);
        System.out.println("A área do Trapézio é: " + areaTrapezio);



    }






}
