package ConceitosOO;


import java.util.Objects;

public class Conta {

    private double saldo; // atributos da conta
    private int agencia;
    private int numero;
    Cliente titular; // composição de um objeto, ou seja uma classe com atributos próprios
    private static int total;

    // Construtor, passa os parametros essenciais para criar um objeto ou obrigação.
    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Nova conta criada = " + this.numero);
        System.out.println("O Total de contas é = " + total);
    }


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


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
         if(agencia <= 0){
             System.out.println("não pode valor menor ou igual a 0");
             return;
         }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("não pode valor menor ou igual a 0");
            return;
        }
        this.numero = numero;
    }
}
