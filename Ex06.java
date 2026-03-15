// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;

            try (Scanner entrada = new Scanner(System.in)) {

                System.out.println("Digite a base (em cm): ");
                base = entrada.nextDouble();

                System.out.println("Digite a altura (em cm): ");
                altura = entrada.nextDouble();

                area = base * altura;

                System.out.printf("\nÁrea do retângulo: %.1f cm²\n", area);
            }
    }
}
