package ConceitosOO;

import lombok.Data;

import java.util.Objects;

@Data
public class Conta {
   private double saldo; // atributos da conta
    private int agencia;
    private int numero;
    Cliente titular; // composição de um objeto, ou seja uma classe com atributos próprios


    // criação de métodos que são comportamentos que ConceitosOO.Conta pode executar

     public void deposita(double valor) {
        this.saldo += valor;
     }

     public boolean saca(double valor){
         if(this.saldo >= valor) { // O this é uma referencia para determinar que é o saldo deste objeto e não de outro
             this.saldo = saldo - valor;
             return true;
         } else {
             return false;
         }
     }

     public void transfere(double valor, Conta destino) {

         System.out.println("Processando Transferência....");
         if (destino.titular == titular && !Objects.equals(destino.titular.getCpf(), titular.getCpf())) {

             System.out.println("Desculpe, digite outro titular para receber a transferência");

         } else if (this.saldo >= valor) {
             this.saldo -= valor;
             destino.deposita(valor);
             System.out.println("Transferência efetuada com sucesso");
             return;
         }
         System.out.println("Erro ao tranferir - saldo insuficiente");
     }
}
