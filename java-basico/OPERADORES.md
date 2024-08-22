# Operadores em Java: Atribuição, Aritméticos 

Em Java, operadores são símbolos especiais que realizam operações em variáveis e valores. Nesta seção, abordaremos os operadores de atribuição, aritméticos, e a concatenação de strings.

## Operadores de Atribuição

Os operadores de atribuição são usados para atribuir valores a variáveis. O operador de atribuição básico em Java é o `=`. Ele atribui o valor à direita da expressão à variável à esquerda.

### Exemplos de Operadores de Atribuição

```java
int x = 10; // Atribui o valor 10 à variável x
int y = 5;  // Atribui o valor 5 à variável y
```

Além do operador `=`, Java fornece operadores de atribuição combinados, que executam uma operação e atribuem o resultado à variável. Estes incluem:

- `+=`: Adição e atribuição
- `-=`: Subtração e atribuição
- `*=`: Multiplicação e atribuição
- `/=`: Divisão e atribuição
- `%=`: Módulo e atribuição

### Exemplos de Operadores de Atribuição Combinados

```java
int a = 10;
a += 5;  // Equivalente a a = a + 5, então a agora é 15

int b = 20;
b -= 3;  // Equivalente a b = b - 3, então b agora é 17
```

## Operadores Aritméticos

Os operadores aritméticos em Java são utilizados para realizar operações matemáticas básicas, como adição, subtração, multiplicação, divisão e módulo.

### Lista de Operadores Aritméticos

- `+` : Adição
- `-` : Subtração
- `*` : Multiplicação
- `/` : Divisão
- `%` : Módulo (resto da divisão)

### Exemplos de Operadores Aritméticos

```java
int x = 10;
int y = 3;

int soma = x + y;      // soma é 13
int subtracao = x - y; // subtracao é 7
int multiplicacao = x * y; // multiplicacao é 30
int divisao = x / y;   // divisao é 3 (divisão inteira)
int modulo = x % y;    // modulo é 1 (resto da divisão de 10 por 3)
```

### Atenção com a Divisão Inteira

Na divisão de dois inteiros, o resultado é sempre um número inteiro. Isso significa que qualquer fração será descartada. Para obter um resultado fracionado, é necessário usar números de ponto flutuante (`float`, `double`).

```java
double resultado = 10.0 / 3.0; // resultado é 3.3333...
```

## Concatenação de Strings

Concatenação de strings é o processo de unir duas ou mais strings em uma única string. Em Java, o operador `+` é usado para concatenar strings.

### Exemplos de Concatenação de Strings

```java
String saudacao = "Olá";
String nome = "Mundo";

String mensagem = saudacao + " " + nome + "!";
// mensagem agora é "Olá Mundo!"
```

Se um dos operandos for uma string e o outro for um valor não-string, o operador `+` converte automaticamente o valor não-string em uma string antes de realizar a concatenação.

```java
int idade = 30;
String frase = "Eu tenho " + idade + " anos.";
// frase agora é "Eu tenho 30 anos."
```

A concatenação de strings pode ser muito útil para criar mensagens dinâmicas e personalizadas em uma aplicação.



# Operadores Unários

Os operadores unários em Java são operadores que atuam sobre um único operando para realizar diversas operações, como incremento, decremento, negação lógica, entre outras. Esses operadores são frequentemente utilizados para simplificar expressões e manipular valores de variáveis.

## Tipos de Operadores Unários

### 1. Operador de Incremento (`++`)

O operador de incremento `++` aumenta o valor da variável em 1. Ele pode ser usado em duas formas:

- **Pré-incremento (`++variável`)**: Incrementa o valor da variável antes de usá-lo na expressão.
- **Pós-incremento (`variável++`)**: Usa o valor da variável na expressão e depois o incrementa.

#### Exemplos de Incremento

```java
int x = 5;

int y = ++x; // x é incrementado para 6, e y recebe 6
int z = x++; // z recebe 6, e depois x é incrementado para 7
```

### 2. Operador de Decremento (`--`)

O operador de decremento `--` reduz o valor da variável em 1. Assim como o incremento, ele pode ser usado em duas formas:

- **Pré-decremento (`--variável`)**: Decrementa o valor da variável antes de usá-lo na expressão.
- **Pós-decremento (`variável--`)**: Usa o valor da variável na expressão e depois o decrementa.

#### Exemplos de Decremento

```java
int a = 10;

int b = --a; // a é decrementado para 9, e b recebe 9
int c = a--; // c recebe 9, e depois a é decrementado para 8
```

### 3. Operador de Negação Lógica (`!`)

O operador de negação lógica `!` inverte o valor booleano de uma expressão. Se a expressão é `true`, ele a torna `false`, e vice-versa.

#### Exemplos de Negação Lógica

```java
boolean verdade = true;
boolean falso = !verdade; // falso é false
```

### 4. Operador Unário de Negação (`-`)

O operador unário de negação `-` inverte o sinal de um número, tornando positivo em negativo, e negativo em positivo.

#### Exemplo de Negação

```java
int num = 10;
int negNum = -num; // negNum é -10

int posNum = -negNum; // posNum é 10 novamente
```

### 5. Operador de Valor Positivo (`+`)

O operador `+`, quando usado unariamente, não altera o valor da variável, mas pode ser usado para indicar que o valor é positivo, embora seja pouco utilizado na prática.

#### Exemplo de Operador Positivo

```java
int positivo = +5; // positivo é 5
```

Os operadores unários são fundamentais para manipulações rápidas e eficientes de valores e variáveis em Java. Eles podem parecer simples, mas seu uso correto pode fazer uma grande diferença no comportamento do código.

# Operador Ternário em Java

O operador ternário é uma forma concisa e elegante de escrever uma expressão condicional em Java. Ele é utilizado para simplificar a estrutura `if-else` em uma única linha de código. O operador ternário é o único operador que utiliza três operandos, daí o nome "ternário".

## Estrutura do Operador Ternário

A estrutura básica do operador ternário é:

```java
condicional ? valor_se_verdadeiro : valor_se_falso;
```

- **`condicao`**: Uma expressão booleana que será avaliada. Se for verdadeira, o operador retornará o valor correspondente ao `valor_se_verdadeiro`.
- **`valor_se_verdadeiro`**: O valor que será retornado se a condição for verdadeira.
- **`valor_se_falso`**: O valor que será retornado se a condição for falsa.

## Exemplos de Uso do Operador Ternário

### Exemplo 1: Determinar o Maior Valor

Vamos considerar dois números e determinar qual deles é o maior usando o operador ternário.

```java
int a = 10;
int b = 20;

int maior = (a > b) ? a : b;
// maior será 20, pois b é maior que a
```

### Exemplo 2: Verificar se um Número é Par ou Ímpar

O operador ternário também pode ser usado para determinar se um número é par ou ímpar.

```java
int numero = 5;

String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
// resultado será "Ímpar", pois 5 não é divisível por 2
```

### Exemplo 3: Atribuir Valor Baseado em Condição

Em alguns casos, você pode usar o operador ternário para atribuir valores a uma variável com base em uma condição.

```java
boolean estaChovendo = true;

String mensagem = estaChovendo ? "Leve um guarda-chuva!" : "Aproveite o sol!";
// mensagem será "Leve um guarda-chuva!", pois a condição estaChovendo é verdadeira
```

## Vantagens do Operador Ternário

- **Conciso**: Reduz o código `if-else` a uma única linha, tornando-o mais limpo e fácil de ler.
- **Expressivo**: Torna o código mais expressivo ao descrever de forma clara o que está sendo avaliado e os resultados possíveis.

## Considerações

Embora o operador ternário possa tornar o código mais curto, ele deve ser usado com cuidado. Em casos onde a lógica condicional é complexa, um `if-else` tradicional pode ser mais fácil de entender e manter. Além disso, o operador ternário deve ser usado de forma a não comprometer a legibilidade do código.

---

O operador ternário é uma ferramenta poderosa em Java para expressar condições simples de forma compacta e eficiente. Seu uso adequado pode simplificar o código, mas é importante garantir que ele não prejudique a clareza e a manutenção do código.

# Operadores Relacionais em Java

Os operadores relacionais em Java são utilizados para comparar dois valores e determinar a relação entre eles. Eles são frequentemente utilizados em expressões condicionais, como em estruturas `if`, `while`, `for`, entre outras. O resultado de uma operação relacional é sempre um valor booleano (`true` ou `false`).

## Lista de Operadores Relacionais

### 1. Igualdade (`==`)

O operador de igualdade compara dois valores para verificar se eles são iguais.

```java
int a = 5;
int b = 5;
boolean resultado = (a == b); // resultado é true
```

### 2. Diferença (`!=`)

O operador de diferença verifica se dois valores são diferentes.

```java
int x = 10;
int y = 20;
boolean resultado = (x != y); // resultado é true
```

### 3. Maior que (`>`)

O operador `>` verifica se o valor à esquerda é maior que o valor à direita.

```java
int a = 15;
int b = 10;
boolean resultado = (a > b); // resultado é true
```

### 4. Menor que (`<`)

O operador `<` verifica se o valor à esquerda é menor que o valor à direita.

```java
int x = 5;
int y = 10;
boolean resultado = (x < y); // resultado é true
```

### 5. Maior ou igual (`>=`)

O operador `>=` verifica se o valor à esquerda é maior ou igual ao valor à direita.

```java
int a = 10;
int b = 10;
boolean resultado = (a >= b); // resultado é true
```

### 6. Menor ou igual (`<=`)

O operador `<=` verifica se o valor à esquerda é menor ou igual ao valor à direita.

```java
int x = 5;
int y = 10;
boolean resultado = (x <= y); // resultado é true
```

## Exemplos Práticos

### Exemplo 1: Comparação de Números

Vamos usar os operadores relacionais para comparar dois números e determinar se um deles é maior, menor ou igual ao outro.

```java
int num1 = 30;
int num2 = 25;

boolean maior = num1 > num2; // true
boolean menor = num1 < num2; // false
boolean igual = num1 == num2; // false
```

### Exemplo 2: Verificação de Intervalo

Podemos verificar se um número está dentro de um intervalo usando operadores relacionais.

```java
int idade = 25;

boolean isAdulto = (idade >= 18) && (idade <= 65);
// isAdulto será true, pois 25 está entre 18 e 65
```

### Exemplo 3: Comparação de Strings

Embora o operador `==` possa ser usado para comparar referências de objetos, para comparar o conteúdo de strings, deve-se usar o método `.equals()`.

```java
String nome1 = "Java";
String nome2 = "Java";
String nome3 = new String("Java");

boolean resultado1 = (nome1 == nome2);  // true, pois nome1 e nome2 referenciam o mesmo objeto
boolean resultado2 = (nome1 == nome3);  // false, pois nome1 e nome3 são objetos diferentes
boolean resultado3 = nome1.equals(nome3); // true, pois o conteúdo das strings é o mesmo
```

## Considerações

Os operadores relacionais são fundamentais para a tomada de decisões em Java. É importante entender que ao comparar tipos de dados diferentes, como `int` com `float`, o Java realiza uma promoção de tipo para que ambos os operandos sejam comparáveis.

---

Os operadores relacionais em Java são essenciais para avaliar condições e tomar decisões com base na comparação de valores. Eles são amplamente utilizados em estruturas de controle de fluxo, permitindo que os programas Java tomem decisões dinâmicas e conduzam diferentes ações com base nos resultados dessas comparações.

# Operadores Lógicos em Java

Os operadores lógicos em Java são usados para combinar expressões booleanas, permitindo criar condições mais complexas. Eles retornam um valor booleano (`true` ou `false`) como resultado e são amplamente utilizados em estruturas de controle de fluxo, como `if`, `while`, e `for`.

## Tipos de Operadores Lógicos

### 1. **E lógico (`&&`)**

O operador `&&` (E lógico) retorna `true` se **ambas** as expressões forem verdadeiras. Se uma das expressões for falsa, o resultado será `false`.

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean resultado = condicao1 && condicao2; // resultado será false
```

- **Exemplo Prático:**
  
  Verificar se um número está dentro de um determinado intervalo:

  ```java
  int idade = 20;
  boolean isAdulto = (idade >= 18) && (idade <= 65); // isAdulto será true
  ```

### 2. **OU lógico (`||`)**

O operador `||` (OU lógico) retorna `true` se **pelo menos uma** das expressões for verdadeira. Ele só retorna `false` se ambas as expressões forem falsas.

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean resultado = condicao1 || condicao2; // resultado será true
```

- **Exemplo Prático:**
  
  Verificar se um número é positivo ou par:

  ```java
  int numero = 4;
  boolean condicao = (numero > 0) || (numero % 2 == 0); // condicao será true
  ```

### 3. **NÃO lógico (`!`)**

O operador `!` (NÃO lógico) inverte o valor da expressão booleana. Se a expressão for `true`, ele retorna `false`, e vice-versa.

```java
boolean condicao = true;

boolean resultado = !condicao; // resultado será false
```

- **Exemplo Prático:**
  
  Verificar se um usuário **não** está autenticado:

  ```java
  boolean isAutenticado = false;
  boolean precisaAutenticar = !isAutenticado; // precisaAutenticar será true
  ```

### 4. **E lógico bit a bit (`&`)**

O operador `&` é similar ao `&&`, mas opera bit a bit e avalia **ambas** as expressões, mesmo que a primeira seja `false`. Ele retorna `true` se ambos os bits forem `1`.

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean resultado = condicao1 & condicao2; // resultado será false
```

### 5. **OU lógico bit a bit (`|`)**

O operador `|` é similar ao `||`, mas também opera bit a bit e avalia ambas as expressões. Ele retorna `true` se pelo menos um dos bits for `1`.

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean resultado = condicao1 | condicao2; // resultado será true
```

### 6. **OU exclusivo lógico bit a bit (`^`)**

O operador `^` (OU exclusivo) retorna `true` se **exatamente uma** das expressões for verdadeira. Se ambas forem verdadeiras ou ambas forem falsas, ele retorna `false`.

```java
boolean condicao1 = true;
boolean condicao2 = false;

boolean resultado = condicao1 ^ condicao2; // resultado será true
```

## Precedência dos Operadores Lógicos

Os operadores lógicos têm uma ordem de precedência, o que significa que alguns operadores são avaliados antes de outros quando usados juntos em uma expressão. A ordem de precedência é a seguinte:

1. `!` (NÃO)
2. `&&` (E lógico) e `&` (E lógico bit a bit)
3. `||` (OU lógico) e `|` (OU lógico bit a bit)
4. `^` (OU exclusivo lógico bit a bit)

No entanto, é recomendável usar parênteses para tornar as expressões mais claras e garantir a ordem correta de avaliação.

## Exemplo Completo

Vamos combinar diferentes operadores lógicos em uma única expressão:

```java
int idade = 25;
boolean isEstudante = true;
boolean isIdoso = idade >= 65;

boolean desconto = (idade < 18 || isEstudante) && !isIdoso;
// desconto será true, pois a idade é menor que 18 ou a pessoa é estudante, e não é idosa
```

---

Os operadores lógicos são essenciais para a construção de condições complexas em Java. Eles permitem que você combine múltiplas expressões booleanas de maneira eficiente e clara, tornando seu código mais poderoso e flexível na tomada de decisões.