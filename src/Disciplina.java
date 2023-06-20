public class Disciplina {
    private String nome;
    private Professor professor;

    public String getNome() {

        return nome;
    }

    public Disciplina(String nome){

        this.nome = nome;

    }
    public Disciplina(String nome, Professor professor) {
        super();
        this.professor = professor;
    }

    public Professor getProfessor() {

        return professor;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setProfessor(Professor professor) {

        this.professor = professor;
    }
}
