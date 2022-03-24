# UVA-Problem1521

Resolução do problema 1521 do site UVa Online Judge: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=4267

# 1521. GCD Jogo de Adivinhação

# O Problema

Paul fez uma festa de aniversário ontem, e eles estavam jogando um jogo de adivinhação com Andrew: Andrew estava tentando adivinhar a idade de Paul. Andrew sabe que a idade de Paul é um inteiro entre 1 e n, incluso. Andrew pode adivinhar qualquer número x entre 1 e n, e Paul contará a ele qual é o maior divisor comum de x e sua idade. 
Aqui um possível desenrolar do game para n = 6. Andrew começa com o palpite 3, e Paul responde que o maior divisor comum de 3 e sua idade é 1. Isso significa que a idade de Paul não pode ser 3 ou 6, mas pode ser 1, 2, 4 ou 5. Andrew continua com o palpite 2, e Paul responde 2. Isso significa que a idade de Paul não pode ser 1 ou 5, e as duas únicas escolhas restantes são 2 e 4. Finalmente, Andrew chuta 4, e Paul responde 2. Isso significa que a idade de Paul é 2, e o game acabou.
Andrew precisou de três palpites no exemplo acima, mas é possível determinar sempre a idade de Paul em no máximo dois palpites para n = 6. A estratégia ideal para Andrew é: no primeiro passo, chuto 6. Se Paul diz 1, então é 1 ou 5 e ele pode checar qual é chutando 5. Se Paul diz 2, então é 2 ou 4, e ele pode checar chutando 4 como vimos acima. Se Paul diz 3, então nós já sabemos que a resposta é 3. Finalmente, se Paul diz 6, a resposta é 6. 
Qual é o número de palpites requeridos no pior caso se Andrew adivinhar de forma otimizada para dado n?

# Entrada
A entrada conterá diversos casos de teste, cada um deles como descrito a seguir.
O arquivo de entrada contém um inteiro n, com 2 ≤  n ≤ 10000.

# Saída
Para cada caso de teste, a saída será feita em uma linha.
A saída será um inteiro – o número de chutes que Andrew terá que fazer no pior caso.

Exemplo de Entrada
6
 Exemplo de Saída
2
