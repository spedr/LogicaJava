package main;

import java.util.Scanner;

public class NumerosImpares {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contadorImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número inteiro:");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + contadorImpares);
        scanner.close();
    }
}