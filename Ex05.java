// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        
        double nota1;
        double nota2;
        double nota3;
        double media;

            try (Scanner entrada = new Scanner (System.in)) {
        
            System.out.println("\nCalcular média de três notas\n");

            System.out.println("Digite a nota 1: ");
            nota1 = entrada.nextDouble();

            System.out.println("Digite a nota 2: ");
            nota2 = entrada.nextDouble();

            System.out.println("Digite a nota 3: ");
            nota3 = entrada.nextDouble();

            media = (nota1 + nota2 + nota3) / 3;

            System.out.printf("Média: %.2f\n", media);
        }
    }
}
