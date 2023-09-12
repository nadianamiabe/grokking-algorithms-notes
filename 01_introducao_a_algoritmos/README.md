### Busca binária

A busca binária é um algoritmo que resolve problemas de busca.

Sua entrada é uma **lista ordenada** de elementos. Se o elemento que você está buscando está na lista, a busca binária retorna a sua posição. Caso contrário, ela retorna null.

Ela funciona dividindo repetidamente pela metade a porção da lista que deve conter o item, até reduzir as posições possíveis a apenas uma.

> Imagine o seguinte: Eu tenho uma lista de 1 a 100 e peço para você adivinhar o meu número. Se você checar um por um (**busca linear**), no pior caso, terá passado por todos os números. Usando a **busca binária** você realizá **no máximo 7 tentativas**. 

> Imaginando um cenário muito maior, o caso fica ainda mais impressionante: Numa lista de 240 mil números, numa busca linear seriam 240 mil tentativas enquanto que na busca binária seriam necessárias apenas 18 tentativas.

De maneira geral, para uma lista de ***n*** números: 
* busca binária -> log2***n***
* busca linear -> ***n***

### Notação Big O

#### Tempo de execução 

Caso estejamos procurando otimizar tempo e espaço, buscamos algoritmos mais eficientes. 

Olhando para à pesquisa simples, quanto tempo é otimizado? Com essa abordagem nós precisamos checar item por item. Se fosse uma lista de 100 números, então seriam 100 tentativas; se fosse uma lista com 4 bilhões de números, seriam 4 bilhões de tentativas.
Isso é chamado de **tempo linear**.

```número de tentativas == tamanho da lista``` 

A busca binária é diferente. Se a lista tem 100 itens, precisamos de, no máximo, 7 tentativas; se tem 4 bilhões, 32 tentativas. Isso porque a busca binária é executada no **tempo logarítmico**. 

#### Notação Big O

É uma notação especial que diz o quão rápido é um algoritmo. 

* Tempo de execução dos algoritmos cresce a *taxas diferentes*

    |                         | pesquisa simples | busca binária |
    | ----------------------  | ---------------- | ------------- |
    | 100 elementos           | 100 ms           | 7ms           |
    | 10000 elementos         | 10 segundos      | 14ms          |
    | 1,000,000,000 elementos | 11 dias          | 32ms          |

    Conforme o número de itens cresce, a busca binária aumenta só um pouco o seu tempo de execução. Já na pesquisa simples leva *muito* tempo a mais. Logo, a busca binária se torna *muito* mais rápida. Considerando a lista com 1 bilhão de itens, com a busca binária, o tempo de execução fica aproximadamente **33 milhões** de vezes mais rápido.

    Por isso não basta saber quanto tempo leva um algoritmo para ser executado, precisamos saber se o *tempo de execução aumenta conforme a lista aumenta*. É ai que entra a notação Big O.

    Numa lista de tamanho ***n***: 
    * pesquisa simples -> O(n)
    * busca binária -> O(log n) 
    > Quando falamos de Notação Big O, levamos em conta que **log** sempre significa **log2**

* A notação Big O permite que você compare o número de operações. Ela informa o quão rapidamente um algoritmo cresce.

* A notação Big O estabelece o tempo de execução para a *pior hipótese* 

#### Alguns exemplos comuns de tempo de execução Big O

* O(log n) -> tempo logarítmico. Ex: busca binária
* O(n) -> tempo linear. Ex: pesquisa simples
* O(n * log n) -> Ex: quicksort (algoritmo rápido de ordenação)
* O(n^2) -> Ex: ordenação por seleção (algoritmo lento de ordenação)
* O(n!) -> Ex: caixeiro-viajante (algoritmo bastante lento)


