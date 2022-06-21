package ConceitosOO;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(13337, 24226);
        System.out.println(conta.getAgencia());

        Conta conta2 = new Conta(13337, 56235);
        Conta conta3 = new Conta(21323, 45666);
    }
}
