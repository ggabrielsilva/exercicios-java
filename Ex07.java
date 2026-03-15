// Nome: Gabriel Ramos da Silva
// Matrícula: 1252211621112
 
import java.util.Scanner;

public class Ex07{
    public static void main(String[] args) {
        
        double  distancia;
        double  gasto;
        double  consumo;

        try (Scanner entrada = new Scanner(System.in)){
            System.out.print("\nDistância percorrida (km): ");
            distancia = entrada.nextDouble();

            System.out.print("\nCombustível gasto (litros): ");
            gasto = entrada.nextDouble();

            consumo = distancia / gasto;

        }

        System.out.printf("\nConsumo médio: %.2f km/l%n", consumo);
    }
}
