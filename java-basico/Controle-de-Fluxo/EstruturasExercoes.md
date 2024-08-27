# Estruturas de Exceções em Java

Em Java, o tratamento de exceções é uma parte fundamental para criar programas robustos e à prova de falhas. As exceções são eventos que ocorrem durante a execução de um programa e podem interromper o fluxo normal do código se não forem tratadas. Para lidar com essas situações, Java oferece as estruturas `try` e `catch`.

## O que é uma Exceção?

Uma exceção é um problema que surge durante a execução de um programa. Pode ser causada por diversos motivos, como tentar dividir um número por zero, acessar um índice inválido em um array, ou tentar abrir um arquivo inexistente. Se uma exceção não for tratada, o programa será encerrado abruptamente.

### Bloco `try`

O bloco `try` é usado para envolver o código que pode potencialmente lançar uma exceção. Dentro deste bloco, você coloca o código que deseja monitorar para possíveis exceções.

### Bloco `catch`

O bloco `catch` é usado para capturar e tratar as exceções que ocorrem no bloco `try`. Quando uma exceção é lançada dentro do bloco `try`, o controle é passado imediatamente para o bloco `catch`, onde a exceção é tratada. Após o tratamento da exceção, o programa continua sua execução.

### Sintaxe Básica

```java
try {
    // Código que pode lançar uma exceção
} catch (TipoDaExceção ex) {
    // Código para tratar a exceção
}
```

- **`TipoDaExceção`**: Especifica o tipo de exceção que você quer capturar. Por exemplo, `ArithmeticException`, `NullPointerException`, etc.
- **`ex`**: Um objeto que representa a exceção capturada. Pode ser usado para obter mais informações sobre a exceção.

### Exemplo 1: Tratando uma Exceção de Divisão por Zero

```java
public class ExemploExcecao {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ex) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }
    }
}
```

**Explicação:**
- O código dentro do bloco `try` tenta dividir 10 por 0, o que lança uma `ArithmeticException`.
- O bloco `catch` captura essa exceção e executa o código para tratar o erro, imprimindo uma mensagem de erro ao invés de encerrar o programa abruptamente.

### Exemplo 2: Tratando Exceções de Acesso a Índice de Array

```java
public class ExemploArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};

        try {
            System.out.println("Número: " + numeros[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: Índice fora dos limites do array.");
        }
    }
}
```

**Explicação:**
- O código tenta acessar o índice 5 de um array com apenas 3 elementos, o que lança uma `ArrayIndexOutOfBoundsException`.
- O bloco `catch` captura essa exceção e trata o erro, evitando que o programa seja encerrado.

### Vantagens do Uso de `try` e `catch`

- **Robustez**: Permite que seu programa lide graciosamente com erros inesperados, mantendo o controle e continuidade.
- **Manutenção**: Facilita a depuração e manutenção do código, já que as exceções podem ser capturadas e tratadas em um local específico.
- **Feedback ao Usuário**: Permite que o programa forneça feedback claro ao usuário em caso de erros, em vez de simplesmente travar.

### Considerações Finais

- **Especificidade**: Tente capturar exceções específicas ao invés de usar um bloco `catch` genérico, pois isso torna o código mais legível e o tratamento mais eficaz.
- **Fluxo de Controle**: Após o bloco `catch`, o programa continua a execução normal, a menos que uma nova exceção seja lançada ou um comando `return` ou `throw` seja executado dentro do `catch`.

---

O uso adequado das estruturas `try` e `catch` em Java é essencial para escrever programas que sejam resilientes e capazes de lidar com situações inesperadas de maneira controlada.

A linguagem Java dispõe de uma vasta lista de classes que representam exceções, abaixo iremos apresentar as mais comuns:

| Nome                           | Causa                                                                |
| ------------------------------ | -------------------------------------------------------------------- |
| java.lang.NullPointerException | Quando tentamos obter alguma informação de uma variável nula.        |
| java.lang.ArithmeticException  | Quando tentamos dividir um valor por zero.                           |
| java.sql.SQLException          | Quando existe algum erro relacionado a interação com banco de dados. |
| java.io.FileNotFoundException  | Quando tentamos ler ou escrever em um arquivo que não existe.        |

### Tratamento de exceções

E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

A instrução **`try`** permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.&#x20;

A instrução **`catch`** permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.&#x20;

A instrução **`finally`** permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave `try` e `catch` vêm em pares:&#x20;

Estrutura de um bloco com try e catch

```java
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
```

{% hint style="warning" %}
O bloco **`try`** / **`catch`** pode conter um conjunto de **catchs** correspondentes a cada exceção que **prevista** em uma funcionalidade do programa.
{% endhint %}

### Hierarquia das exceções

A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas **Checked and Unchecked Exceptions** ou _Exceções Checadas e Não Checadas_.&#x20;

![](<../.gitbook/assets/image (6).png>)

{% hint style="info" %}
O que determina uma exceção ser classificado como **checada** ou **não checada** ?\
É o risco dela ser disparada logo você precisa tratá-la, exemplo:
{% endhint %}

Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto contém Alfanuméricos.

```java
public class ExemploExcecao {
    public static void main(String[] args) {
        Number valor = Double.valueOf("a1.75");

        valor = NumberFormat.getInstance().parse("a1.75");
        
        System.out.println(valor);
       
    }
}
```

{% hint style="info" %}
As linhas 3 e 5 apresentarão uma exceção ao serem executadas, e a linha 5 contém um método que pode disparar uma exceção checada, logo nós programadores que iremos usar este método teremos que tratá-la explicitamente com **`try \ catch`**.
{% endhint %}

### Exceções customizadas

Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo:

* Imagina que como regra de negócio, para formatar um cep necessita sempre de ter 8 dígitos, caso contrário lançará uma exceção que denominamos de **CepInvalidoException**.
* Primeiro criamos nossa exceção:

```java
public class CepInvalidoException extends Exception {}
```

* Em seguida criamos nosso método de formatação de cep.

```java
static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
```

#### Referências

{"https://www.w3schools.com/java/java_try_catch.asp"}

{"https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html"}