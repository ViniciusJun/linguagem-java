# Estruturas Condicionais

As estruturas condicionais em Java permitem que o programa tome decisões e execute diferentes blocos de código com base em condições específicas. As principais estruturas condicionais em Java são `if`, `else if`, `else`, e `switch`.

## 1. Estrutura `if` ou condicional simples

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

## 2. Estrutura `else` ou condicional composta

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

## 3. Estrutura `else if` ou condicional encadeanada

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

Sendo uma alternativa ao uso de vários `else if` a estrutura `switch` compara o valor de cada caso com o da variável em sequência e, ao encontrar uma correspondência, executa o código associado àquele caso. O comando `break` interrompe a execução da estrutura em que está inserido quando é executado. 

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

No contexto da estrutura condicional `switch` em Java, as palavras-chave `break`, `continue`, e `default` têm funções específicas que controlam o fluxo de execução dentro do `switch` e de outras estruturas de controle. Vamos entender cada uma delas:

### 1. **`break` no `switch`**

A palavra-chave `break` é usada para interromper a execução do `switch` após um caso ter sido satisfeito e executado. Sem o `break`, o fluxo continua para o próximo caso, o que pode levar a resultados inesperados.

#### Exemplo:

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
    case 4:
        System.out.println("Quarta-feira");
        break;
    default:
        System.out.println("Outro dia");
        break;
}
```

**Explicação:**
- Neste exemplo, `diaDaSemana` é 3, então o caso `case 3:` é executado, e a mensagem "Terça-feira" é impressa.
- O `break` logo após `System.out.println("Terça-feira");` impede que o programa continue executando os casos subsequentes (caso 4 e `default`).

### 2. **`default` no `switch`**

A palavra-chave `default` é usada para capturar qualquer valor que não corresponda a nenhum dos casos especificados no `switch`. Funciona como um `else` em uma estrutura `if-else`.

#### Exemplo:

```java
int diaDaSemana = 7;

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
    case 4:
        System.out.println("Quarta-feira");
        break;
    default:
        System.out.println("Outro dia");
        break;
}
```

**Explicação:**
- Como `diaDaSemana` é 7, que não corresponde a nenhum dos casos definidos (1 a 4), o bloco `default` é executado, imprimindo "Outro dia".

### 3. **`continue` no `switch`**

Embora `continue` seja comumente usado em laços (`for`, `while`, `do-while`) para pular o restante do código na iteração atual e passar para a próxima, ele não é utilizado diretamente dentro de um `switch`. Se você tentar usar `continue` em um `switch`, você receberá um erro de compilação.

Em um laço dentro de um `switch`, você poderia usar `continue` para continuar para a próxima iteração do laço:

#### Exemplo com `continue` em um laço dentro de um `switch`:

```java
int numero = 2;

switch (numero) {
    case 1:
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                continue; // Pula o restante da iteração atual do laço
            }
            System.out.println("Iteração " + i);
        }
        break;
    case 2:
        System.out.println("Número é 2");
        break;
    default:
        System.out.println("Número desconhecido");
        break;
}
```

**Explicação:**
- Como `numero` é 2, apenas "Número é 2" será impresso. O `continue` neste exemplo demonstra como ele funcionaria em um laço `for` dentro de um `switch`, mas não é aplicável diretamente ao `switch`.

---

### Resumo:
- **`break`**: Interrompe a execução de um bloco `switch` ou laço de repetição.
- **`default`**: Captura todos os casos não correspondidos em um `switch`.
- **`continue`**: Não é usado diretamente em um `switch`, mas é útil para pular iterações em laços.

Esses elementos ajudam a controlar o fluxo de execução, permitindo que seu programa responda corretamente a diferentes condições.

---

## Condicional ternária

A condição ternária em Java é uma forma concisa de escrever uma estrutura condicional `if-else`. Ela é usada para atribuir um valor a uma variável com base em uma condição. A sintaxe básica da condição ternária é:

```java
variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
```

### Exemplo 1: Atribuição de valor com base em uma condição

```java
// Cenário 1
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
}
```

Neste exemplo, a variável `resultado` receberá o valor `"Aprovado"` se a condição `nota >= 7` for verdadeira; caso contrário, receberá `"Reprovado"`.

### Exemplo 2: Atribuição com base em várias condições

```java
// Cenário 2
public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado"; //O comando "&&" significa o operador booleano end. 
		System.out.println(resultado);
	}
}

```

Neste exemplo o código avalia a variavel nota e imprime `"Aprovado"` se `nota >= 7`, `"Recuperação"` se a nota estiver entre 5 e 6, e `"Reprovado"` se `nota < 5`.

---

A condição ternária é útil para simplificar o código em situações onde uma simples decisão `if-else` é suficiente, tornando o código mais compacto e fácil de ler. No entanto, para condições mais complexas ou para múltiplas ações, é melhor usar estruturas `if-else` tradicionais.