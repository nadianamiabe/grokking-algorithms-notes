## Recursão 

Recursão é quando uma função chama a si mesma. É uma técnica de programação muito usada em vários algoritmos. 

É comum errarmos ao utilizarmos essa técnica, resultando em um loop infinito. Isso pois ao escrever uma função recursiva, devemos informar **quando a recursão deve parar**.

Toda função recursiva possui duas partes: 
* CASO-BASE -> quando a função **não chama** a si mesma novamente, de forma que o programa não se torna um loop infinito
* CASO RECURSIVO -> quando a função **chama** a si mesma

### Pilha de chamada (call stack)

Uma pilha possui o seguinte comportamento: quando um item é inserido, ele é colocado no TOPO da pilha. Quando um item precisa ser lido/removido, esse item é o que está no topo, ou seja, o último item adicionado na pilha.
Logo uma pilha possui duas ações: 
* PUSH -> adicionar um item ao topo
* POP -> remover o item do topo

