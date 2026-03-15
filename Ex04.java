// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        double salarioAtual;
        double reajuste;
        double novoSalario;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nProgama para calcular reajuste de salario\n");

            System.out.println("Informe o salario atual do funcionario:");
            salarioAtual = entrada.nextDouble();

            reajuste     = salarioAtual * 0.07;
            novoSalario  = salarioAtual + reajuste;        
        }

        System.out.println("\nSalario atual R$" + salarioAtual);
        System.out.println("Reajuste(7%): R$"  + reajuste);
        System.out.println("Novo salario: R$"   + novoSalario);
    }
    
}
