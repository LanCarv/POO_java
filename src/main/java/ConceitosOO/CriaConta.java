package ConceitosOO;

import java.util.Scanner;

public class CriaConta {

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);

        // Criando um objeto do tipo Marcela que recebe os atributos da classe Cliente
        Cliente Marcela = new Cliente();
        Marcela.nome = "Marcela de Assis Silveira Costa";
        Marcela.cpf = "139.259.678.10";
        Marcela.idade = "31";
        Marcela.rg = "15.536.855";
        Marcela.profissao = "Gerente de Banco";
        Marcela.salario = 8000.00;

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.agencia = 14563;
        contaDaMarcela.numero = 1;
        contaDaMarcela.saldo = 15000;
        System.out.println("Saldo inicial Marcela = " + contaDaMarcela.saldo);

        contaDaMarcela.titular = Marcela;

        // criando novo objeto sendo uma segunda conta

        Cliente Paulo = new Cliente();
        Paulo.nome = "Paulo Amorim Silveira";
        Paulo.cpf = "889.995.777.21";
        Paulo.idade = "30";
        Paulo.rg = "19.956.900";
        Paulo.profissao = "Uber";
        Paulo.salario = 2000.00;

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.agencia = 75413;
        contaDoPaulo.numero = 2;
        contaDoPaulo.saldo = 100;
        System.out.println("Saldo inicial Paulo = " + contaDoPaulo.saldo);

        contaDaMarcela.transfere(500,contaDoPaulo);
        System.out.println("Saldo Atual Marcela = " + contaDaMarcela.getSaldo());
        System.out.println("Saldo Atual Paulo = " +contaDoPaulo.getSaldo());

        contaDoPaulo.titular = Paulo;

        // Criando um objeto do tipo Robson que recebe os atributos da classe Cliente
        Cliente Robson = new Cliente();
        Robson.nome = "Robson Miguel Silveira";
        Robson.cpf = "149.629.726.18";
        Robson.idade = "23";
        Robson.rg = "18.936.968";
        Robson.profissao = "Desenvolvedor";
        Robson.salario = 7200.00;

        // Criando um objeto do tipo contaDoRobson que recebe o atributo deposita  da classe Conta onde setamos o valor
        Conta contaDoRobson = new Conta();
        contaDoRobson.deposita(500);

        // realiza a composição de objetos
        contaDoRobson.titular = Robson;
    }
}
