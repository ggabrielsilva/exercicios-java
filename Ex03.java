// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        

        double valorDolar;
        double valorReais;
        double cotacao = 4.95;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("\nProgama para converter Dolar em Reais\n");
            System.out.println("Cotacao atual: US$ 1 = R$ 4,95\n");

            System.out.println("Informe o valor em dolar (US$):");
            valorDolar = entrada.nextDouble();

            valorReais = valorDolar * cotacao;
        }

        System.out.printf("\nO valor em reais e: R$" + valorReais);
    }
}

