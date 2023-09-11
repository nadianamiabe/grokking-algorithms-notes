### Pesquisa binária

A pesquisa binária é um algoritmo que resolve problemas de busca.

Sua entrada é uma **lista ordenada** de elementos. Se o elemento que você está buscando está na lista, a pesquisa binária retorna a sua posição. Caso contrário, ela retorna null.

Ela funciona dividindo repetidamente pela metade a porção da lista que deve conter o item, até reduzir as posições possíveis a apenas uma.

> Imagine o seguinte: Eu tenho uma lista de 1 a 100 e peço para você adivinhar o meu número. Se você checar um por um (**busca linear**), no pior caso, terá passado por todos os números. Usando a **busca binária** você realizá **no máximo 7 tentativas**. 

> Imaginando um cenário muito maior, o caso fica ainda mais impressionante: Numa lista de 240 mil números, numa busca linear seriam 240 mil tentativas enquanto que na busca binária seriam necessárias apenas 18 tentativas.

De maneira geral, para uma lista de ***n*** números: 
* busca binária -> log2***n***
* busca linear -> ***n***