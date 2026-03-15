// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        

        int numA;
        int numB;
        int resultadoSoma;
        int resultadoSubtracao;
        int resultadoMultiplicacao;
        double resultadoDivisao;

        try (Scanner entrada = new Scanner(System.in)) { System.out.println("\nPrograma para calcular as quatro operacoes aritimericas\n");

        System.out.println("Informe o primeiro numero:");
        numA = entrada.nextInt();

        System.out.println("Informe o segundo numero:");
        numB = entrada.nextInt();

        resultadoSoma               = numA + numB;
        resultadoSubtracao          = numA - numB;
        resultadoMultiplicacao      = numA * numB;
        resultadoDivisao            = (double) numA / numB; 
        }

        System.out.println("\nResultados:");
        System.out.println("Adicao:             " + resultadoSoma);
        System.out.println("Subtracao:          " + resultadoSubtracao);
        System.out.println("Multiplicacao:      " + resultadoMultiplicacao);
        System.out.println("Divisao:            " + resultadoDivisao);
        
    }

    
}
