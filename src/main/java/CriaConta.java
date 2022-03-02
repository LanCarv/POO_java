import java.util.Scanner;

public class CriaConta {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Conta marcela = new Conta(); // criando objeto primeira conta

        marcela.titular = " Marcela";
        marcela.agencia = 1212343;
        marcela.numero = 880;
        marcela.deposita(1000);
        System.out.println("A conta da Marcela tem = " + marcela.saldo);


       Conta paulo = new Conta(); // criando novo objeto sendo uma segunda conta

        paulo.titular = " Paulo";
        paulo.agencia = 123343;
        paulo.numero = 550;
        paulo.saldo = 50;
        System.out.println("A conta do Paulo tem = " + paulo.saldo);


        marcela.transfere(500,paulo);
        System.out.println(marcela);
        System.out.println(paulo);
    }
}
