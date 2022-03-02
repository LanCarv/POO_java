import lombok.Data;

import java.util.Scanner;


@Data
public class TesteScanner {

    public static void main(String[] args) {

        TestClient testeClient = new TestClient();
        Scanner scan = new Scanner(System.in); // criando objeto scanner

        System.out.println("Olá, informe seu nome por gentileza");
        testeClient.nome = scan.nextLine();

        System.out.println("Muito bem " + testeClient.nome + " Agora me informe sua idade");
        testeClient.idade = Integer.parseInt(scan.nextLine());

        if (testeClient.idade < 18)
            System.out.println("Que isso " + testeClient.nome + " ja esta quase virando de maior em");

        else if(testeClient.idade >= 18 && testeClient.idade <= 30)
            System.out.println("Muito bom " + testeClient.idade + " anos !! com essa idade você tem que investir e posso te apresentar nossa plataforma invest haha vamos continuar? ");

        else if (testeClient.idade > 40 && testeClient.idade <= 60)
            System.out.println("Olha só " + testeClient.idade + " anos você pode largar a poupança e vir investir conosco");
        else
            System.out.println("Hmm o senhor(a) pode entrar em contato conosco por meio do numero (31)977612321 pois, temos condições especiais ok? lhe aguardo");

        System.out.println("Vamos precisar do Seu CPF por favor");
        testeClient.cpf = scan.nextLine();

        System.out.println("Bacana só mais um dado para finalizarmos " + testeClient.nome + ", me fala seu rg pode ser?");
        testeClient.rg = scan.nextLine();

       System.out.println("Parabéns, seus dados foram armazenados com sucesso " + testeClient.nome);
        System.out.println(" Idade:" + testeClient.idade);
        System.out.println(" CPF:" + testeClient.cpf);
        System.out.println(" RG:" + testeClient.rg);

       scan.close();
    }
}
