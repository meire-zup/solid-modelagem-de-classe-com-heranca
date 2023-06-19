import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Professor professor1 = new Professor("João Paulo da Silva", "000.000.000-02", 123456L
        , "xxxxx", 5000.00);

        Professor professor2 = new Professor("Antonio Paulo da Silva", "000.000.000-02", 123456L
        , "xxxxx", 5000.00);

        Professor professor3 = new Professor("Ana Paula da Silva", "000.000.000-02", 123456L
        , "xxxxx", 5000.00);

        Coordenador coordenador1 = new Coordenador("João Paulo da Silva", "000.000.000-02", 123456L
        , "xxxxx", 5000.00);

        Estagiario estagiario1 = new Estagiario("Joana Ferreira", "000.000.000-02", 1200.00);
        Estagiario estagiario2 = new Estagiario("Fernando Ferreira", "000.000.000-02", 1200.00);
        Estagiario estagiario3 = new Estagiario("Mario Ferreira", "000.000.000-02", 1200.00);

        professor1.aumentaSalario(professor1.getSalario());
        Double salario = professor1.getSalario();

        System.out.println(salario);
        salario = 10.0;
        System.out.println(professor1.getSalario());


        coordenador1.aumentaSalario(coordenador1.getSalario());

        coordenador1.adicionaProfessor(professor1);
        coordenador1.adicionaProfessor(professor2);
        coordenador1.adicionaProfessor(professor3);
        Turma turma1 = new Turma("Turma A");
        professor1.adicionaTurma(turma1);
        professor1.adicionaEstagiario(estagiario1);
        professor1.adicionaEstagiario(estagiario2);
        professor1.adicionaEstagiario(estagiario3);

        estagiario1.reembolsaDespesa(300.00);
        professor1.reembolsaDespesa(500.00);











    }
}