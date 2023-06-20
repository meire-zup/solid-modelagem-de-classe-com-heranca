import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {

    private String nivelDeGraduacao;
    private List<Disciplina> disciplinaMinistrada = new ArrayList<>();

    private List<Aluno> alunos = new ArrayList<>();
    private List<Turma> turmas = new ArrayList<>();

    private List<Estagiario> estagiarios = new ArrayList<>();

    public Professor(String nome, String cpf, Long numeroDeRegistro, String orgaoDeLotacao, Double salario) {

        super(nome, cpf, numeroDeRegistro, orgaoDeLotacao, salario);

    }

    public String getNivelDeGraduacao() {

        return nivelDeGraduacao;
    }

    public List<Disciplina> getDisciplinaMinistrada() {

        return disciplinaMinistrada;
    }

    public List<Aluno> getAlunos() {

        return alunos;
    }

    public List<Turma> getTurma() {

        return turmas;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {

        this.nivelDeGraduacao = nivelDeGraduacao;

    }

    public void setDisciplinaMinistrada(List<Disciplina> disciplinaMinistrada) {

        this.disciplinaMinistrada = disciplinaMinistrada;

    }

    public void setAlunos(List<Aluno> alunos) {

        this.alunos = alunos;

    }

    public void setTurma(List<Turma> turma) {

        this.turmas = turma;

    }

    public void adicionaTurma(Turma turma){

       this.turmas.add(turma);
       System.out.println(turma.getNome() + " adicionada com sucesso!");

    }

    public void adicionaEstagiario(Estagiario estagiario){

        if (this.estagiarios.size() < 2){

            this.estagiarios.add(estagiario);
            System.out.println(estagiario.getNome() + " adicionado com sucesso!");

        } else {

            System.out.println("Estagiário "+ estagiario.getNome() +" não pode ser adicionado.");
            System.out.println("Não é possível contratar mais de 2 estagiários.");

        }

    }

}
