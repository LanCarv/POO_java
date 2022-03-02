import lombok.Data;

import java.util.Objects;

@Data
public class Conta {
    double saldo; // atributos da conta
    int agencia;
    int numero;
    String titular;


    // criação de métodos que são comportamentos que Conta pode executar
     public void deposita(double valor) {
        this.saldo = saldo + valor;
     }

     public boolean saca(double valor){
         if(this.saldo >= valor) {
             this.saldo = saldo - valor;
             return true;
         } else {
             return false;
         }
     }

     public boolean transfere(double valor, Conta destino) {

         if (destino.titular == titular) {

             System.out.println("Desculpe, digite outro titular para receber a transferência");

         } else if (this.saldo >= valor) {
             this.saldo -= valor;
             destino.deposita(valor);
             System.out.println("Transferência efetuada com sucesso");
             return true;
         }
         System.out.println("Erro ao tranferir - saldo insuficiente");
         return false;
     }
}
