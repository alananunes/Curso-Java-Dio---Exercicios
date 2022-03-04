package br.com.dio.tiposdadosoperacoesarit;

public class Mensagem {

    public static void obterMensagem(int hora){


        if (hora >= 5 && hora <= 12){
            mensagemBomdia();

        }else if(hora >= 13 && hora <= 17){
            mensagemBoaTarde();

        }else{
            mensagemBoaNoite();
        }

    }

    private static void mensagemBoaNoite() {
        System.out.println("BOA NOITE");
    }


    private static void mensagemBoaTarde() {
        System.out.println("BOA TARDE");
    }

    private static void mensagemBomdia() {
        System.out.println("BOM DIA");
    }


}
