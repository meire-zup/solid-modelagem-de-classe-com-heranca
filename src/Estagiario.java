public class Estagiario implements Despesa{

    private String nome;

    private String cpf;

    private Double bolsa;

    public Estagiario(String nome, String cpf, Double bolsa) {
        this.nome = nome;
        this.cpf = cpf;
        this.bolsa = bolsa;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getBolsa() {
        return bolsa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setBolsa(Double bolsa) {
        this.bolsa = bolsa;
    }
    @Override
    public void reembolsaDespesa(double valorDespesa) {

        System.out.println("O valor "+ valorDespesa +" será depositado em sua conta!");
    }


}
