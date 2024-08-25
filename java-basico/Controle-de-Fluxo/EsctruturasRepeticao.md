# Estruturas de Repetição

As estruturas de repetição em Java permitem que um bloco de código seja executado várias vezes, dependendo de uma condição ou conjunto de condições. As principais estruturas de repetição em Java são:

1. **`for`**
2. **`while`**
3. **`do-while`**

## Estrutura de Repetição `for` em Java

A estrutura de repetição `for` é usada quando você sabe de antemão quantas vezes deseja repetir um bloco de código. Ela é útil para iterar sobre sequências numéricas, arrays, listas, ou qualquer outra coleção de dados.

### Sintaxe do `for`

```java
for (inicialização; condição; atualização) {
    // Código a ser executado a cada iteração
}
```

- **inicialização**: Declaração e inicialização da variável de controle do loop (executada apenas uma vez).
- **condição**: Expressão booleana que determina se o loop deve continuar. Se a condição for verdadeira, o loop continua; se for falsa, ele termina.
- **atualização**: Incrementa ou decrementa a variável de controle após cada iteração.

### Exemplo 1: Loop Simples

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Valor de i: " + i);
}
```

**Explicação:**
- O loop começa com `i` igual a 0.
- A cada iteração, `i` é incrementado em 1 (`i++`).
- O loop continua enquanto `i` for menor que 5.
- O código dentro do loop (`System.out.println("Valor de i: " + i);`) é executado cinco vezes, imprimindo os valores de 0 a 4.

### Exemplo 2: Iterando sobre um Array

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Número: " + numeros[i]);
}
```

**Explicação:**
- O loop começa com `i` igual a 0.
- A condição `i < numeros.length` garante que o loop continue enquanto `i` for menor que o comprimento do array `numeros`.
- O loop percorre todos os elementos do array, imprimindo cada um.

### Exemplo 3: Loop `for` Aninhado

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

**Explicação:**
- Aqui temos dois loops `for` aninhados.
- O loop externo controla a variável `i` e o interno controla `j`.
- Para cada valor de `i`, o loop interno executa três vezes, resultando em uma tabela de combinações de `i` e `j`.

---

A estrutura `for` é fundamental em Java para controlar iterações de maneira eficiente e clara. Ela é especialmente útil quando o número de repetições é conhecido de antemão.

Aqui estão alguns exemplos de como usar a estrutura de repetição `for` para iterar sobre arrays em Java:

### Exemplo 1: Iterando sobre um Array de Inteiros

```java
int[] numeros = {5, 10, 15, 20, 25};

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Elemento no índice " + i + ": " + numeros[i]);
}
```

**Explicação:**
- O array `numeros` contém cinco elementos.
- O loop `for` usa a variável `i` para acessar cada elemento do array.
- `numeros.length` retorna o tamanho do array (neste caso, 5), garantindo que o loop percorra todos os elementos.
- O código dentro do loop imprime cada elemento do array e seu índice correspondente.

### Exemplo 2: Iterando sobre um Array de Strings

```java
String[] nomes = {"Alice", "Bob", "Carol", "David", "Eva"};

for (int i = 0; i < nomes.length; i++) {
    System.out.println("Nome: " + nomes[i]);
}
```

**Explicação:**
- O array `nomes` contém cinco nomes.
- O loop `for` percorre cada elemento do array e imprime o nome armazenado em cada posição.

### Exemplo 3: Somando os Valores de um Array

```java
int[] numeros = {1, 2, 3, 4, 5};
int soma = 0;

for (int i = 0; i < numeros.length; i++) {
    soma += numeros[i];
}

System.out.println("A soma dos números é: " + soma);
```

**Explicação:**
- O array `numeros` contém cinco valores inteiros.
- O loop `for` itera sobre cada elemento do array e adiciona seu valor à variável `soma`.
- Após o loop, a soma de todos os elementos do array é impressa.

### Exemplo 4: Iterando sobre um Array Multidimensional

```java
int[][] matriz = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.println("Elemento em [" + i + "][" + j + "]: " + matriz[i][j]);
    }
}
```

**Explicação:**
- `matriz` é um array bidimensional (matriz).
- O primeiro loop `for` percorre as linhas da matriz.
- O segundo loop `for` percorre as colunas de cada linha.
- O código imprime cada elemento da matriz com suas coordenadas `[i][j]`.

### Exemplo 5: Usando o `for-each` para Iterar sobre um Array

O loop `for-each` é uma forma simplificada de iterar sobre arrays e coleções em Java.

```java
int[] numeros = {10, 20, 30, 40, 50};

for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```

**Explicação:**
- O loop `for-each` itera diretamente sobre os elementos do array, sem a necessidade de um índice.
- Para cada iteração, a variável `numero` recebe o valor do próximo elemento do array.
- O código imprime cada número do array.

---

Esses exemplos mostram diferentes maneiras de usar a estrutura `for` para trabalhar com arrays em Java, desde a iteração simples até o uso em arrays multidimensionais.

Aqui estão explicações e exemplos de como usar as instruções `break` e `continue` dentro de um loop `for` em Java.

### `break` no Loop `for`

A instrução `break` é usada para interromper o loop antes que ele complete todas as iterações. Quando o `break` é executado, o loop é encerrado imediatamente, e o controle do programa passa para a linha seguinte ao loop.

#### Exemplo: Uso de `break` no `for`

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Interrompe o loop quando i for igual a 5
    }
    System.out.println("i: " + i);
}
System.out.println("Loop encerrado.");
```

**Explicação:**
- O loop `for` começa com `i` igual a 0 e continua até que `i` seja menor que 10.
- Quando `i` atinge o valor 5, a instrução `break` é executada, interrompendo o loop.
- O código imprime os valores de `i` de 0 a 4, e em seguida, o loop é encerrado.

### `continue` no Loop `for`

A instrução `continue` é usada para pular a iteração atual do loop e passar para a próxima iteração. Quando `continue` é executado, o código após essa instrução dentro do loop é ignorado para a iteração atual, e o loop avança para a próxima iteração.

#### Exemplo: Uso de `continue` no `for`

```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // Pula a iteração se i for um número par
    }
    System.out.println("i: " + i);
}
System.out.println("Loop concluído.");
```

**Explicação:**
- O loop `for` percorre os valores de `i` de 0 a 9.
- Quando `i` é um número par (`i % 2 == 0`), a instrução `continue` é executada, e a impressão do valor de `i` é pulada.
- Como resultado, apenas os valores ímpares de `i` são impressos: 1, 3, 5, 7, 9.

### Combinação de `break` e `continue`

É possível usar `break` e `continue` juntos em um loop, dependendo da lógica que você deseja implementar.

```java
for (int i = 0; i < 10; i++) {
    if (i == 7) {
        break; // Interrompe o loop quando i for igual a 7
    }
    if (i % 2 == 0) {
        continue; // Pula a iteração se i for um número par
    }
    System.out.println("i: " + i);
}
System.out.println("Loop encerrado.");
```

**Explicação:**
- O loop imprime apenas os números ímpares até o número 7, pois:
  - Números pares são pulados devido ao `continue`.
  - O loop é interrompido quando `i` é igual a 7 devido ao `break`.

---

Esses exemplos mostram como `break` e `continue` podem ser usados para controlar o fluxo de execução dentro de um loop `for` em Java.

---

### Estrutura de Repetição `while` em Java

A estrutura de repetição `while` em Java é usada para executar repetidamente um bloco de código enquanto uma determinada condição for verdadeira. Ao contrário do `for`, o `while` é mais adequado para situações em que o número de iterações não é conhecido antecipadamente.

### Sintaxe do `while`

```java
while (condição) {
    // Código a ser executado enquanto a condição for verdadeira
}
```

- **condição**: Uma expressão booleana que é avaliada antes de cada iteração. Se a condição for verdadeira, o loop continua; se for falsa, o loop é encerrado.

### Exemplo 1: Loop Simples com `while`

```java
int contador = 0;

while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

**Explicação:**
- O loop `while` começa com `contador` igual a 0.
- Enquanto `contador` for menor que 5, o bloco de código dentro do loop é executado.
- A cada iteração, `contador` é incrementado em 1 (`contador++`).
- O loop imprime os valores de 0 a 4, e depois é encerrado.

### Exemplo 2: Usando `while` para Validar Entrada do Usuário

```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
int numero;

System.out.print("Digite um número positivo: ");
numero = scanner.nextInt();

while (numero <= 0) {
    System.out.println("Número inválido. Tente novamente.");
    System.out.print("Digite um número positivo: ");
    numero = scanner.nextInt();
}

System.out.println("Você digitou: " + numero);
```

**Explicação:**
- O loop `while` continua pedindo ao usuário para digitar um número positivo até que um número maior que 0 seja inserido.
- Se o usuário inserir um número negativo ou zero, o loop continua pedindo uma nova entrada.

### Exemplo 3: Loop Infinito com `while`

Um loop `while` pode se tornar infinito se a condição nunca se tornar falsa. Isso pode ser útil em certas situações, como servidores que precisam rodar indefinidamente, mas geralmente deve ser evitado, pois pode causar o travamento do programa.

```java
while (true) {
    System.out.println("Este é um loop infinito!");
    // Normalmente há uma condição de saída dentro do loop para quebrar o loop
}
```

**Explicação:**
- O `while (true)` cria um loop infinito porque a condição `true` nunca será falsa.
- Para interromper um loop infinito, geralmente usamos uma instrução `break` dentro do loop com base em alguma condição.

### Exemplo 4: Usando `break` em um Loop `while`

```java
int contador = 0;

while (true) {
    if (contador == 5) {
        break; // Interrompe o loop quando contador for igual a 5
    }
    System.out.println("Contador: " + contador);
    contador++;
}
```

**Explicação:**
- Este loop `while` é configurado como um loop infinito (`while (true)`).
- O loop é interrompido usando a instrução `break` quando `contador` atinge 5.

### Considerações sobre o Uso do `while`

- **Condição de Saída**: Sempre certifique-se de que a condição do `while` possa se tornar falsa em algum ponto, para evitar loops infinitos acidentais.
- **Aplicação**: O `while` é ideal para situações em que você não sabe o número exato de iterações necessárias, como na validação de entrada do usuário ou na leitura de dados até o final de um arquivo.

---

O `while` é uma estrutura de repetição poderosa em Java, especialmente útil quando as iterações dependem de uma condição que pode não ser previsível antecipadamente.