// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        

        int numX;
        int numY;

        try (Scanner entrada = new Scanner(System.in)){
            
            System.out.println("\nProgama para mostrar o resto da divisao\n");

            System.out.println("Informe o primeiro numero:");
            numX = entrada.nextInt();

            System.out.println("Informeo segundo numero:");
            numY = entrada.nextInt();

            int resto = numX % numY;
        
            System.out.println("\nResultados:");
            System.out.println("Resto da divisao: " + resto);
        }
    }
}
