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

Exemplo: 

```
def sauda(nome):
  print "Olá, " + nome
  sauda2(nome)
  print "preparando para dizer tchau"
  tchau()

def sauda2(nome):
  print "Como vai " + nome + "?"

def tchau():
  print "ok, tchau!"

```

    |                |  * o computador aloca um espaço na memória para a chamada sauda
    | -------------- |  * depois salva na memória os valores para todas as variáveis e em seguida imprime o primeiro print
    | sauda("maggie")|  * então chama a segunda função sauda2


    |                 |
    | --------------- | * no momento que chama a sauda2, a função é alocada em outro bloco de memória no topo da pilha
    | sauda2("maggie")| * o print da segunda função é chamado
    | sauda("maggie") |  

    |                 | * depois de executar o print há o retorno da chamada da função, quando isso ocorre, a caixa do topo da pilha é retirada
    | --------------- |   restando novamente só o bloco da primeira chamada
    | sauda("maggie") | * agora estamos de volta a primeira função, e o segundo print dela pode ser executado

    |                 | 
    | --------------- | 
    |     tchau()     | * depois do segundo print, a função tchau é chamada e novamente é reservado um bloco de espaço para ela
    | sauda("maggie") |

    |                 | * depois é executado o print do tchau e essa chamada é finalizada, dessa forma o bloco é retirado do topo também
    | --------------- | * voltando a função sauda, não há nada a ser feito, podemos finalizá-la também
    | sauda("maggie") |



Quando a função **sauda2** foi chamada, a função **sauda** ficou **parcialmente completa**. Essa é a ideia por trás da callstack, quando você chama uma função a partir de outra, a chamada de função fica pausada em um estado parcialmente completo. 

