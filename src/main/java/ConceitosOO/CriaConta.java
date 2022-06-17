package ConceitosOO;

public class CriaConta {

    public static void main(String[] args) {

       // Scanner scan = new Scanner(System.in);

        // Criando um objeto do tipo Marcela que recebe os atributos da classe Cliente

        Cliente Marcela = new Cliente();
        Marcela.setNome("Marcela de Assis Silveira Costa");
        Marcela.setCpf("139.259.678.10");
        Marcela.setIdade("31");
        Marcela.setRg("15.536.855");
        Marcela.setProfissao("Gerente de Banco");
        Marcela.setSalario(8000.00);

        // Criando um objeto contaDaMarcela que recebe os atributos da conta

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.setAgencia(14563);
        contaDaMarcela.setNumero(1);
        contaDaMarcela.deposita(15000);
        System.out.println("Saldo inicial Marcela = " + contaDaMarcela.getSaldo());

        contaDaMarcela.titular = Marcela;

        // Criando um objeto do tipo Paulo que recebe os atributos da classe Cliente

        Cliente Paulo = new Cliente();
        Paulo.setNome("Paulo Amorim Silveira");
        Paulo.setCpf("889.995.777.21");
        Paulo.setIdade("30");
        Paulo.setRg("19.956.900");
        Paulo.setProfissao("Uber");
        Paulo.setSalario(2000.00);

        // Criando um objeto contaDoPaulo que recebe os atributos da conta

        Conta contaDoPaulo = new Conta();
        contaDoPaulo.setAgencia(75413);
        contaDoPaulo.setNumero(2);
        contaDoPaulo.deposita(100);
        System.out.println("Saldo inicial Paulo = " + contaDoPaulo.getSaldo());

        // Acionando método transfere criado na Classe conta que modifica (seta) os atributos chamados neste objeto

        contaDaMarcela.transfere(500,contaDoPaulo);
        System.out.println("Saldo Atual Marcela = " + contaDaMarcela.getSaldo());
        System.out.println("Saldo Atual Paulo = " +contaDoPaulo.getSaldo());

        contaDoPaulo.titular = Paulo;

        // Criando um objeto do tipo Robson que recebe os atributos da classe Cliente

        Cliente Robson = new Cliente();
        Robson.setNome("Robson Miguel Silveira");
        Robson.setCpf("149.629.726.18");
        Robson.setIdade("23");
        Robson.setRg("18.936.968");
        Robson.setProfissao("Desenvolvedor Pleno");
        Robson.setSalario(7200.00);

        // Criando um objeto do tipo contaDoRobson que recebe o atributo deposita  da classe Conta onde setamos o valor desejado
        Conta contaDoRobson = new Conta();
        contaDoRobson.deposita(500);

        // realiza a composição de objetos
        contaDoRobson.titular = Robson;
    }
}
