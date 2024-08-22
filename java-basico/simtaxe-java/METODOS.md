# Métodos em Java: Conceitos e Critérios de Nomeação e Definição

## O Que São Métodos?

Em Java, um método é um bloco de código que realiza uma tarefa específica. Ele pode ser chamado várias vezes em diferentes partes do programa para executar a mesma tarefa, o que ajuda a reduzir a redundância e a organizar o código de forma mais modular.

### Estrutura de um Método

A estrutura básica de um método em Java é a seguinte:

```java
tipoDeRetorno nomeDoMetodo(parametros) {
    // Corpo do método
    // Instruções a serem executadas
}
```

- **tipoDeRetorno**: Indica o tipo de dado que o método retorna. Se o método não retornar nada, usa-se a palavra-chave `void`.
- **nomeDoMetodo**: O nome que identifica o método.
- **parametros**: Uma lista de variáveis que o método pode receber como entrada. Se o método não precisar de parâmetros, os parênteses ficam vazios.
- **corpo do método**: O bloco de código que será executado quando o método for chamado.

### Exemplo de Método

Aqui está um exemplo simples de um método em Java:

```java
public int soma(int a, int b) {
    return a + b;
}
```

Neste exemplo:
- O método `soma` recebe dois parâmetros do tipo `int` (`a` e `b`).
- O método retorna um valor do tipo `int` que é a soma de `a` e `b`.

## Critérios de Nomeação de Métodos

A nomeação de métodos em Java segue certas convenções que ajudam a tornar o código mais legível e consistente:

1. **Camel Case**: O nome do método deve começar com uma letra minúscula, e cada nova palavra no nome começa com uma letra maiúscula. Exemplo: `calculaArea`, `obtemNomeCompleto`.

2. **Verbo**: O nome de um método geralmente deve ser um verbo ou uma expressão verbal, pois métodos realizam ações. Exemplo: `calcular`, `imprimir`, `obter`.

3. **Clareza e Descritividade**: O nome do método deve ser claro e descritivo sobre o que o método faz. Isso facilita o entendimento do código. Evite abreviações ou nomes vagos.

4. **Consistência**: Mantenha a consistência na nomenclatura ao longo do projeto. Se você usa "calcula" para métodos que realizam cálculos, siga esse padrão para todos os métodos relacionados a cálculos.

## Critérios de Definição de Métodos

Ao definir métodos em Java, é importante considerar os seguintes critérios:

1. **Finalidade do Método**: Determine o que o método deve fazer. Um método deve realizar uma única tarefa bem definida. Se o método estiver fazendo muitas coisas diferentes, considere dividir em métodos menores.

2. **Tipo de Retorno**: Defina o tipo de dado que o método deve retornar. Se o método não precisar retornar um valor, use `void`.

3. **Parâmetros**: Decida quais informações o método precisa para realizar sua tarefa. Defina os parâmetros necessários para receber essas informações.

4. **Visibilidade**: Defina o modificador de acesso do método (por exemplo, `public`, `private`). Isso controla onde o método pode ser chamado:
   - `public`: O método pode ser acessado de qualquer lugar.
   - `private`: O método só pode ser acessado dentro da classe onde foi definido.
   - `protected`: O método pode ser acessado dentro do mesmo pacote ou por subclasses.

5. **Tratamento de Exceções**: Se o método pode gerar exceções, considere como essas exceções serão tratadas. Use `try-catch` ou defina o método para lançar exceções específicas com a palavra-chave `throws`.

6. **Reutilização**: Pense em como o método pode ser reutilizado em diferentes partes do seu código. Um bom método é genérico o suficiente para ser útil em várias situações.

Abaixo temos um exemplo de uma classe com dois métodos e suas respectivas considerações:
```java
public class MyClass {
	
	public double somar(int num1, int num2){
		//LOGICA - FINALIDADE DO MÉTODO
		return ... ;
	}
	
	public void imprimir(String texto){
		//LOGICA - FINALIDADE DO MÉTODO
		//AQUI NÃO PRECISA DO RETURN
		//POIS NÃO SERÁ RETORNADO NENHUM RESULTADO
	}
	// throws Exception : indica que o método ao ser utilizado
	// poderá gerar uma exceção
	public double dividir(int dividendo, int divisor) throws Exception{}
	
	// este método não pode ser visto por outras classes no projeto
	private void metodoPrivado(){}
	
	//alguns equívocos estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
```

### Exemplo de Definição de Método

```java
public double calculaAreaRetangulo(double largura, double altura) {
    return largura * altura;
}
```

Neste exemplo:
- O método `calculaAreaRetangulo` é `public`, ou seja, pode ser acessado de qualquer lugar.
- Ele recebe dois parâmetros do tipo `double`, `largura` e `altura`.
- Ele retorna o produto de `largura` e `altura`, que representa a área de um retângulo.

---

Entender e aplicar corretamente os conceitos de métodos, junto com os critérios de nomeação e definição, é essencial para escrever código Java que seja eficiente, legível e fácil de manter. A prática dessas convenções ajudará você a criar programas organizados e robustos.