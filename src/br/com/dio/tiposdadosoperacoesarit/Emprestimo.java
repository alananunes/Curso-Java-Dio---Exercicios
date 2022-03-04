package br.com.dio.tiposdadosoperacoesarit;

public class Emprestimo {

    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static double getTxDuasParcelas(){
        return 0.3;
    }
    public static double getTxTresParcelas(){
        return 0.45;
    }
    public static void calculaEmprestimo(double valor, int parcela){

        if(parcela == 2){
            double valorEmprestimo = valor +(valor * getTxDuasParcelas());
            System.out.println("O valor total do empréstimo com a taxa de duas parcelas é: " + valorEmprestimo);

        }else if(parcela == 3){
            double valorEmprestimo = valor + (valor * getTxTresParcelas());
            System.out.println("O valor total do empréstimo com a taxa de três parcelas é: " + valorEmprestimo);

        }else{
            System.out.println("Quantidade de parcela indisponivel");
        }



    }

}
