// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        
        double celsius;
        double fahrenheit;
        double kelvin;

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("Digite a temperatura em Celsius: ");
            celsius = entrada.nextDouble();

            fahrenheit  = (celsius *(9.0/5)) + 32;
            kelvin      = celsius + 273.15;

            System.out.printf("Fahrenheit: %.1f °F\n", fahrenheit);
            System.out.printf("Kelvin: %.2f K\n", kelvin);
        }
    }
}