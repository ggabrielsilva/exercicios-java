// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args) {
        
        double produto;
        double pago;
        double troco;

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("\nPreço do produto:");
            produto = entrada.nextDouble();

            System.out.println("\nValor pago:");
            pago = entrada.nextDouble();

            troco = pago - produto;
            

            System.out.printf("\nTroco: R$ \n%.2f", troco);
        
        }
    }
}
