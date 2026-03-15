// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        double distancia;
        double velocidade;
        double tempo;

        int horas;
        int minutos;

        try (Scanner entrada = new Scanner(System.in)) {

            System.out.println("\nDigite a Distancia (km):");
            distancia = entrada.nextDouble();

            System.out.println("\nDigite a Velocidade média (km):");
            velocidade = entrada.nextDouble();

            tempo = distancia / velocidade;

            horas = (int) tempo;
            minutos = (int) ((tempo - horas) * 60);

            System.out.printf("Tempo estimado: %d horas e %d minutos\n", horas, minutos);


        }
    }
}
