public class FuncionarioAdministrativo extends Funcionario {
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    public FuncionarioAdministrativo(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao
            , Double salario, String funcaoAdministrativa, String senioridade) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.funcaoAdministrativa = funcaoAdministrativa;
        this.senioridade = senioridade;

    }

    public String getFuncaoAdministrativa() {

        return funcaoAdministrativa;
    }

    public String getSenioridade() {

        return senioridade;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {

        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public void setSenioridade(String senioridade) {

        this.senioridade = senioridade;
    }
}
