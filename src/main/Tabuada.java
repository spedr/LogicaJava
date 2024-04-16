package main;

import java.util.Scanner;

public class Tabuada {
    
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        while (true) {
            System.out.print("Digite um número entre 1 e 10: ");
            numero = scanner.nextInt();
            
            if (numero >= 1 && numero <= 10) {
                break;
            }
            
            System.out.println("Informe um número válido (1 a 10)!");
        }
        
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        
        scanner.close();
    }
}
