import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario {

    private List<Professor> professoresSupervisionados = new ArrayList<>();

    public Coordenador(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario){
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
    }

    public Coordenador(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario, List<Professor> professoresSupervisionados) {
        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public List<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public void aumentaSalario(double salario){

        salario = salario * 1.05;
        System.out.println("Novo salário: " + salario);

    }

    public void adicionaProfessor(Professor professor){

        if (this.professoresSupervisionados.size() < 2){

            this.professoresSupervisionados.add(professor);
            System.out.println("Professor "+ professor.getNome() +" adicionado com sucesso.");

        } else {

            System.out.println("Professor "+ professor.getNome() +" não pode ser adicionado.");
            System.out.println("Não é possível supervisionar mais de 2 professores.");

        }

    }

}
