package ConceitosOO;

public class TestaSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        conta.saca(200);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());

        /*proibido pois, não acessamos o atributo diretamente, sempre
         trabalhamos no objeto com métodos e nunca acessando diretamente o atributo por
         este motivo declaramos o atributo como private*/
        //conta.saldo = conta.saldo -101;
        //System.out.println(conta.saldo);
    }
}
