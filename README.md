# Catalisa

Aula Prática.

## Módulo 3

Programação orientada a objetos / Solid and Clean Code.


### Exercícios - solid-modelagem-de-classe-com-heranca

<p> Nessa versão faremos os seguintes ajustes. Modele as classes referentes aos funcionários de uma universidade, que serão os professores, coordenadores e funcionários administrativos.
O que fazer de novo: </p>
<p> Teremos agora estagiários, - esses não têm salários e sim bolsas.</p>
<p>Estagiários são vinculados a professores que têm até 2 - dois.</p>
<p>Todos os funcionários e estagiários terão a função reembolso despesas.</p>

Os atributos comuns de todos os funcionários são: Nome, CPF, número de registro, órgão de lotação e salário.
Os professores possuem os atributos: Nível de graduação, disciplina ministrada , quantidade de alunos e quantidade de turmas.
Os coordenadores possuem os atributos: ProfessoresSupervisionados
Os funcionários administrativos possuem os atributos: Função Administrativa e Senioridade.
<p> Implemente, além dos getters e setters e os construtores, os seguintes métodos: </p>
<p>● aumentoSalario: para todos menos os coordenadores aumenta o salário em 10% e para os coordenadores o aumento é de 5%. </p>
<p>● adicionaTurma: para os professores.</p>
<p>● adicionaProfessor (para os coordenadores): Para adicionar um professor na lista de professores supervisionados.</p>
<p>● Crie uma classe turma, que se tornará uma caraterística dos professores por meio de composição.</p>
<p>● Limite a quantidade de professores supervisionados na classe coordenador.</p>



