package ConceitosOO;

public class Cliente {

    private String nome;
   private String idade;
    private String cpf;
    private String rg;
    private String profissao;
    private Double salario;


    public String getNome() {
        return this.nome;
    }

    public String getIdade() {
        return this.idade;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getRg() {
        return this.rg;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


}
