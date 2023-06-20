public abstract class Funcionario implements Despesa {
    private String nome;
    private String cpf;
    private Long numeroDeRegistro;
    private String orgaoDeLotacao;
    private Double salario;

    public Funcionario(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }

    @Override
    public void reembolsaDespesa(double valorDespesa) {

        System.out.println("O valor de R$ "+ valorDespesa +" será depositado em sua conta!");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getNumeroDeRegistro() {

        return numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {

        return orgaoDeLotacao;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setCpf(String cpf) {

        this.cpf = cpf;
    }

    public void setNumeroDeRegistro(Long numeroDeRegistro) {

        this.numeroDeRegistro = numeroDeRegistro;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {

        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public void setSalario(Double salario) {

        this.salario = salario;
    }

    public Double getSalario() {

        return salario;

    }

    public void aumentaSalario(Double salario){

        salario = this.salario * 1.10;

        System.out.println("R$ " + salario);

    }
}
