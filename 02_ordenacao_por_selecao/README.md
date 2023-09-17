## Como funciona a memória

O computador se parece com um grande conjunto de gavetas, cada gaveta tem seu endereço e pode guardar um elemento. 

Sempre que quer armazenar um item na memória, você pede ao computador um pouco de espaço e ele te dá um endereço no qual você pode armazenar o seu item. 

Para armazenar **múltiplos items**, existem duas maneiras para fazer isso: 
* Arrays
* Listas

## Arrays e listas encadeadas

### Arrays

Usar um array significa que todos os items serão armazenados de **forma contínua** (um após o outro) na memória.

Imagine que precisa adicionar mais um item, além do que já adicionou, mas o próximo slot está ocupado. Neste caso você precisaria solicitar ao computador uma área na memória em que coubessem todos os items. 

É como ir ao cinema com um grupo de pessoas, é necessário encontrar um lugar que caiba todos. Se aparecer mais um amigo e não tiver um lugar para ele, precisa-se achar outra fileira para acomodar todo mundo. 

Da mesma forma, adicionar novos itens num array é um processo lento. 

Uma solução para isso é **reservar** lugares, mesmo que tenha só 3 itens, você pode solicitar 10 espaços. Porem há desvantagens: 
* Os espaços extras podem não ser usados, logo será memória desperdiçada.
* Pode ser necessário mais que 10 espaços e ai terá o mesmo problema. 

### Listas encadeadas

Nas listas encadeadas, os seus itens podem estar em qualquer lugar da memória. Cada item armazena o endereço do próximo item, resultando em vários endereços aleatórios ligados na memória.

Voltando ao exemplo do cinema, é como se o grupo decidisse que tudo bem cada um sentar onde dá. 

Adicionar um item na lista é fácil, você coloca em qualquer lugar da memória e armazena o endereço do item anterior.

### Se as listas encadeadas são muito melhores para inserções, para que servem os arrays? 

Listas encadeadas possuem um problema com acesso aleatório. Suponha que você queira ler o último item da lista, você não consegue fazer isso pois não sabe o endereço dele. Precisa percorrer a lista inteira, pois cada item sabe o endereço do próximo.  

Listas encadeadas são ótimas se quiser ler todos os items, um de cada vez. 

Com arrays, você sabe o endereço de cada item, pelo índice (os elementos estão em sequência, então é fácil calcular a posição). Arrays são ótimos se você deseja ler elementos aleatórios, pois pode encontrar qualquer elemento instantaneamente. 

#### Inserindo algo no meio da lista

Usando listas encadeadas, basta mudar o endereço para o qual o elemento anterior está apontando. 

Já para arrays, deve-se mover todos os itens que estão abaixo do endereço de inserção. Se não houver espaço, é necessário mover tudo para um novo local.

#### Deleção

Novamente, é mais fácil fazer em listas encadeadas, pois só é necessário mudar apenas o endereço para qual o elemento anterior está apontando. 

Com arrays tudo precisa ser movido quando um elemento é eliminado.

#### Tempo de execução para operações comuns de arrays e listas

    |            | Arrays | Listas |
    | ---------  | ------ | ------ |
    | Leitura    | O(1)   | O(n)   |
    | Inserção   | O(n)   | O(1)   |
    | Eliminação | O(n)   | O(1)   |

> O(n) = tempo de execução linear

> O(1) = tempo de execução constante

Vale a pena mencionar que inserções e eliminações terão tempo de execução O(1) somente que pudermos acessar instantaneamente o elemento.

## Ordenação por seleção

Suponha que você tenha um monte de músicas no seu computador. Para cada artista, você tem um contador de plays e quer ordenar do artista mais tocado para o menos tocado.

Uma forma de fazer seria pegar o artista mais tocado e adicioná-lo a uma nova lista. Repetindo isso para o segundo mais tocado e assim por diante. 

Para encontrar o artista com o maior número de plays é preciso verificar cada item da lista - O(n) -, e é necessário repetir n vezes.

Isso resulta em O(n x n) ou O(n ^ 2).

A ordenação por seleção é um algoritmo bom, mas não é muito rápido. 