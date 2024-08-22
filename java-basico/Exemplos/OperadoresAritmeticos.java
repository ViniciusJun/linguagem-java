public class OperadoresAritmeticos {

    public static void main(String[] args) {
        //Aritméticos: O operador aritmético, é utilizado para realizar operações matemáticas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa.
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);
        
        //ATENÇÃO! O operador de adição (+), quando utilizado em variáveis do tipo texto, realizará a “concatenação de textos”.
        String nomeCompleto = "LINGUAGEM" + "JAVA";
		
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1"; //a concatenação ocorre quando o codigo indentifica uma strig no meio das operaçoes, daquele poto endiante a soma sera substituida por concatenação

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); //usando evidencia o codigo faz a somas dos valores munericos mesmo apos a string

        System.out.println(concatenacao);
    }
    
}
