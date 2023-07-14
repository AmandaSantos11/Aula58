# Aula 58

<hr>

*O obejtivo da aula era realizar um exercício em grupo para fixar os conhecimentos adquiridos até o momento. Cada grupo continha 5 membros e era responsável por um exercício, a cada 30min dois integrantes deveria trocar de grupo e isso continuaria até o fim da atividade.*

<hr>

**Grupo 2:** Milena, Vitoria Cerqueira,Thalia,Amanda

**Aplicação 1** - Clube

*Git Flow* - A cada pessoa que codar, feature nova com nome descritivo.

*Pull request* - Dois integrantes do grupo farão o code review e terão que dar o emoji de 'like' na solicitação do pull resquest para sinalizar que foi aprovado. Em seguida será feito o merge com a main e a exclusão da branch.

*SDK* - Corretto 20

**Regra de negócio:**

+ Desenvolver um programa que simule um clube social que precisa de um sistema para gerenciar seus
  membros.
+ Deverá ser implementado uma
  estrutura de classes utilizando os conceitos de orientação a objetos,
  com foco principal na utilização de interfaces.

### Desenvolvimento do programa:

Começamos desenvolvendo a base do programa que consistia na criação da interface 'Membro' com três métodos:

- 'adicionarPontos(pontos:Int)': adiciona uma quantidade de
  pontos especificados ao membro;


- 'removerPontos(pontos: Int)': remove a quantidade de pontos
  especificados do membro;


- 'obterPontos()': Int: retorna a quantidade de pontos atuais do
  membro.

Em seguida desenvolvemos a classe abstrata 'Pessoa' que implementava a interface e têm dois atributos sendo o 'nome:String' e 'pontos:Int'.

A seguir criamos duas subclasses de Pessoa sendo a 'Aluno' e 'Professor', e após criamos a classe 'Clube' que contém uma lista vazia e três métodos:

- adicionarMembro(membro: Membro): adiciona um membro à
  lista de membros do clube;


- removerMembro(membro: Membro): remove um membro da
  lista de membros do clube;


- pontuacaoTotal(): Int: retorna a pontuação total de todos os
  membros do clube.

**Formação do grupo após a 1º troca:** Myllena,Paula,Thalia,Amanda

+ Implementação da lógica de cada método.

**Formação do grupo após a 2º troca:** Vitoria Caroline,Ana Flavia,Myllena,Amanda

+ Implementação da main, teste do código e revisão da regra de negócio.

**Formação do grupo após a 3º troca:** Ana Julia,Ana Tome,Vitoria Caroline,Ana Flavia

+ Revisão do código e adição de melhorias.

**Formação do grupo após última troca:** Milena,Vitoria Cerqueira,Thalia,Amanda

+ Feedbacks.
