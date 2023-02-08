## Vector: implementacão ``java.util.List``

- O Vector tem uma diferença importante em relação ao ArrayList, ele é o que chamamos de **thread safe**.
-  o Vector é utilizado como exceção. As ocasiões em que ele é necessário são raras, ou seja, é difícil termos situações como a citada acima, onde são compartilhadas entre duas ou mais "pilhas" uma mesma lista.
- Mas e se usássemos o Vector como uma medida preventiva? Caso ele fosse ser necessário futuramente? Isso também não funcionaria, já que a utilização dele, em si, tem um custo em desempenho. Assim, se não for estritamente necessário, é melhor utilizar outros tipos de lista, como o ArrayList, que é mais eficiente.
- Thread safe: melhor quando temos mais de um método main, ou seja, mais de uma pilha

## Interface Collection

- Listas permitem repetição de itens, porém nem sempre queremos isso
- Precisamos, primeiro, verificar se determinado elemento já é presente para, somente então, termos segurança para adicioná-lo. Por este motivo, existe um outro mundo de conjuntos, que inclui o java.util.Set e java.util.HashSet. Para entendê-los melhor, é necessário conhecer o método ``hashCode()``.

![Imagem do esquema de interfaces](https://i.ibb.co/QDW7fSJ/Captura-de-tela-2023-02-07-144045.png)

### Set 

- Há uma interface mãe, da List e da Set, que é a Collection.
- O Set não aceita elementos duplicados, portanto não é uma sequência
- Algusn métodos, como o ``get()``, param de funcionar

