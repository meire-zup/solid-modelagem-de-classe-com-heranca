import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Instanciando objetos:

        Professor professor1 = new Professor("João Paulo da Silva", "000.000.000-01", 123456L
        , "xxxxx", 5000.00);
        Professor professor2 = new Professor("Antonio Paulo da Silva", "000.000.000-02", 123456L
        , "xxxxx", 5000.00);
        Professor professor3 = new Professor("Ana Paula da Silva", "000.000.000-03", 123456L
        , "xxxxx", 5000.00);

        Coordenador coordenador1 = new Coordenador("João Paulo da Silva", "000.000.000-04", 123456L
        , "xxxxx", 7000.00);

        Estagiario estagiario1 = new Estagiario("Joana Ferreira", "000.000.000-05", 1200.00);
        Estagiario estagiario2 = new Estagiario("Fernando Ferreira", "000.000.000-06", 1200.00);
        Estagiario estagiario3 = new Estagiario("Mario Ferreira", "000.000.000-07", 1200.00);

        Turma turma1 = new Turma("Turma A");

        Aluno aluno1 = new Aluno("Guilherme Silva", "000.000.000-11");
        Aluno aluno2 = new Aluno("Mariana da Costa", "000.000.000-12");
        Aluno aluno3 = new Aluno("Fernando Correa", "000.000.000-13");
        Aluno aluno4 = new Aluno("Felipe Santos", "000.000.000-14");
        Aluno aluno5 = new Aluno("Carla Silva", "000.000.000-15");
        Aluno aluno6 = new Aluno("Silvana Silva", "000.000.000-16");
        Aluno aluno7 = new Aluno("Marcia Souza", "000.000.000-18");
        Aluno aluno8 = new Aluno("Maria Oliveira", "000.000.000-18");
        Aluno aluno9 = new Aluno("Simone Araujo", "000.000.000-19");
        Aluno aluno10 = new Aluno("Leandro Menezes", "000.000.000-20");

        Disciplina disciplina1 = new Disciplina("Cálculo I");
        Disciplina disciplina2 = new Disciplina("Cálculo II");
        Disciplina disciplina3 = new Disciplina("Cálculo III");
        Disciplina disciplina4 = new Disciplina("Cálculo IV");
        Disciplina disciplina5 = new Disciplina("Química");
        Disciplina disciplina6 = new Disciplina("Física I");
        Disciplina disciplina7 = new Disciplina("Física II");

        FuncionarioAdministrativo funcionarioAdministrativo1 = new FuncionarioAdministrativo("João Paulo da Silva", "000.000.000-01"
                , 123456L, "xxxxx", 3000.00);

        // Testando método aumentaSalario:

        System.out.println("************************************************************");
        System.out.println("Testando método aumentaSalario:");
        System.out.println();
        System.out.println("Salário professor: R$ "+ professor1.getSalario());
        System.out.printf("Salário professor com reajuste: ");
        professor1.aumentaSalario(professor1.getSalario());
        System.out.println();
        System.out.println("Salário funcionário administrativo: R$ "+ funcionarioAdministrativo1.getSalario());
        System.out.printf("Salário funcionário administrativo com reajuste: ");
        funcionarioAdministrativo1.aumentaSalario(funcionarioAdministrativo1.getSalario());
        System.out.println();
        System.out.println("Salário coordenador: R$ "+ coordenador1.getSalario());
        System.out.printf("Salário coordenador com reajuste: ");
        coordenador1.aumentaSalario(coordenador1.getSalario());
        System.out.println("************************************************************");

        // Testando método adicionaTurma:

        System.out.println("Testando método adicionaTurma:");
        System.out.println();
        professor1.adicionaTurma(turma1);
        System.out.println("************************************************************");

        // Testando método adicionaProfessor:

        System.out.println("Testando método adicionaProfessor:");
        System.out.println();
        coordenador1.adicionaProfessor(professor1);
        System.out.println();
        coordenador1.adicionaProfessor(professor2);
        System.out.println();
        coordenador1.adicionaProfessor(professor3);
        System.out.println("************************************************************");

        // Testando método adicionaEstagiarios:

        System.out.println("Testando método adicionaEstagiarios:");
        System.out.println();
        professor1.adicionaEstagiario(estagiario1);
        System.out.println();
        professor1.adicionaEstagiario(estagiario2);
        System.out.println();
        professor1.adicionaEstagiario(estagiario3);
        System.out.println("************************************************************");

        // Testando método reembolsaDespesa:

        System.out.println("Testando método reembolsaDespesa:");
        System.out.println();
        coordenador1.reembolsaDespesa(345.66);
        estagiario1.reembolsaDespesa(300.00);
        professor1.reembolsaDespesa(500.00);
        System.out.println("************************************************************");

    }
}