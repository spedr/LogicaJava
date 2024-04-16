package main;
import java.util.Scanner;

public class DivisaoDeValores {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro valor: ");
        double numerador = scanner.nextDouble();
        
        double denominador;
        while (true) {
            System.out.print("Informe o segundo valor: ");
            denominador = scanner.nextDouble();
            if (denominador != 0) {
                break;
            }
            System.out.println("Impossível fazer divisão por zero. Por favor, informe um valor válido.");
        }
        
        double resultado = numerador / denominador;
        System.out.println("Resultado da divisão: " + resultado);
        scanner.close();
    }
}
