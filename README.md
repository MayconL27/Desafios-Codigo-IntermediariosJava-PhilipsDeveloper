# Desafios-Codigo-IntermediariosJava-PhilipsDeveloper

> 1 / 3 - Notas da Prova

Norminia é uma professora e pesquisadora renomada de uma famosa Universidade do Brasil, com inúmeras prêmiações e reconhecimento internacional pelo seu trabalho. Recentemente, Norminia foi convidada para ministrar aulas em uma Universidade da Alemanhã. Mesmo falando muito bem a Língua alemã, Norminia ficou um pouco apreensiva com a responsabilidade, mas resolveu aceitar a proposta e encará-la como um bom desafio.

Os estudantes adoraram a metodologia de ensino de Norminia e tudo estava indo super bem, até o momento da aplicação da sua primeira prova. Acostumada a dar notas de 0 (zero) a 100 (cem), ela fez o mesmo na primeira prova da sua turma da Alemanhã. No entanto, os estudante acharam estranho, uma vez que na Alemanhã o sistema de notas é diferente: as notas devem ser dadas como conceitos de A a E. O conceito A é o mais alto, enquanto o conceito E é o mais baixo.

Conversando com outros docentes, ela recebeu a sugestão de utilizar a seguinte tabela, relacionando as notas numéricas com as notas de conceitos:

| Nota | Conceito |
| --- | --- |
| 0 | E |
| 1 a 35 | D |
| 36 a 60 | C |
| 61 a 85 | B |
| 86 a 100 | A |

O problema é que Norminia já deu as notas no sistema numérico, e terá que converter as notas para o sistema de letras. No entanto, Norminia precisa preparar as próximas atividades educacionais para os seus alunos, e não tem tempo suficiente para fazer a conversão das notas manualmente.

Você terá o seguinte desafio: escrever um programa que recebe uma nota no sistema numérico e determina o conceito correspondente.

Entrada: A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão (normalmente o teclado). A entrada contém uma única linha com um número inteiro N (0 ≤ N ≤ 100), representando uma nota de prova no sistema numérico.

Saída: Seu programa deve imprimir, na saída padrão, uma letra (A, B, C, D, ou E em maiúsculas) representando o conceito correspondente à nota dada na entrada.

| Exemplos de Entrada | Exemplos de Saída |
| --- | --- |
| 12 | D |
| 87 | A |
| 0 | E |

> 2 / 3 - Sequência Lógica

Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

Entrada: O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída: Imprima a saída conforme o exemplo fornecido.

| Exemplo de Entrada | Exemplo de Saída |
| --- | --- |
| 5 | 1 1 1 |
| | 1 2 2 |
| | 2 4 8 |
| | 2 5 9 |
| | 3 9 27 |
| | 3 10 28 |
| | 4 16 64 |
| | 4 17 65 |
| | 5 25 125 |
| | 5 26 126 |

> 3 / 3 - Tuitando

O microblog Twitter é conhecido por limitar as postagens em 140 caracteres. Conferir se um texto vai caber em um tuíte é sua tarefa.

Entrada: A entrada é uma linha de texto T (1 ≤ |T| ≤ 500).

Saída: A saída é dada em uma única linha. Ela deve ser "TWEET" (sem as aspas) se a linha de texto T tem até 140 caracteres. Se T tem mais de 140 caracteres, a saída deve ser "MUTE".

| Exemplo de Entrada | Exemplo de Saída |
| --- | --- |
| RT @TheEllenShow: If only Bradley's arm was longer. Best photo ever. #oscars pic.twitter.com/C9U5NOtGap | TWEET |
