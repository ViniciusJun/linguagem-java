# Estruturas Condicionais

As estruturas condicionais em Java permitem que o programa tome decisões e execute diferentes blocos de código com base em condições específicas. As principais estruturas condicionais em Java são `if`, `else if`, `else`, e `switch`.

## 1. Estrutura `if`

A estrutura `if` é usada para executar um bloco de código somente se uma determinada condição for verdadeira.

### Sintaxe:

```java
if (condicao) {
    // Código a ser executado se a condição for verdadeira
}
```

### Exemplo:

```java
int numero = 10;

if (numero > 5) {
    System.out.println("O número é maior que 5");
}
```

Neste exemplo, a mensagem "O número é maior que 5" será exibida porque a condição `numero > 5` é verdadeira.

## 2. Estrutura `else`

O `else` é usado em conjunto com o `if` para executar um bloco de código alternativo caso a condição do `if` seja falsa.

### Sintaxe:

```java
if (condicao) {
    // Código a ser executado se a condição for verdadeira
} else {
    // Código a ser executado se a condição for falsa
}
```

### Exemplo:

```java
int numero = 3;

if (numero > 5) {
    System.out.println("O número é maior que 5");
} else {
    System.out.println("O número é menor ou igual a 5");
}
```

Neste caso, como a condição `numero > 5` é falsa, a mensagem "O número é menor ou igual a 5" será exibida.

## 3. Estrutura `else if`

O `else if` é usado para testar várias condições em sequência. Ele permite que você adicione condições adicionais ao bloco `if`.

### Sintaxe:

```java
if (condicao1) {
    // Código a ser executado se a condição1 for verdadeira
} else if (condicao2) {
    // Código a ser executado se a condição1 for falsa e a condição2 for verdadeira
} else {
    // Código a ser executado se todas as condições anteriores forem falsas
}
```

### Exemplo:

```java
int numero = 8;

if (numero > 10) {
    System.out.println("O número é maior que 10");
} else if (numero > 5) {
    System.out.println("O número é maior que 5, mas menor ou igual a 10");
} else {
    System.out.println("O número é menor ou igual a 5");
}
```

Aqui, a mensagem "O número é maior que 5, mas menor ou igual a 10" será exibida, pois a condição `numero > 5` é verdadeira.

## 4. Estrutura `switch`

A estrutura `switch` é usada para selecionar uma das várias opções de execução. Ela é uma alternativa ao uso de vários `else if`.

### Sintaxe:

```java
switch (expressao) {
    case valor1:
        // Código a ser executado se expressao == valor1
        break;
    case valor2:
        // Código a ser executado se expressao == valor2
        break;
    // Você pode ter quantos casos precisar
    default:
        // Código a ser executado se nenhum caso corresponder
        break;
}
```

### Exemplo:

```java
int diaDaSemana = 3;

switch (diaDaSemana) {
    case 1:
        System.out.println("Domingo");
        break;
    case 2:
        System.out.println("Segunda-feira");
        break;
    case 3:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Outro dia");
        break;
}
```

Neste exemplo, a mensagem "Terça-feira" será exibida, pois `diaDaSemana` é igual a 3.

---

Essas são as principais estruturas condicionais em Java. Elas são fundamentais para controlar o fluxo de execução do programa, permitindo que ele tome decisões baseadas em condições dinâmicas.