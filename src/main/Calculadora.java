package main;

import java.util.Scanner;

public class Calculadora {

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        double primeiroNumero = scanner.nextDouble();
        
        System.out.println("Informe o segundo número:");
        double segundoNumero = scanner.nextDouble();
        
        System.out.println("Escolha a operação (1: Adição, 2: Subtração, 3: Multiplicação, 4: Divisão):");
        int operacao = scanner.nextInt();
        
        switch (operacao) {
            case 1: // Adição
                System.out.println("Resultado: " + (primeiroNumero + segundoNumero));
                break;
            case 2: // Subtração
                System.out.println("Resultado: " + (primeiroNumero - segundoNumero));
                break;
            case 3: // Multiplicação
                System.out.println("Resultado: " + (primeiroNumero * segundoNumero));
                break;
            case 4: // Divisão
                if (segundoNumero == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } else {
                    System.out.println("Resultado: " + (primeiroNumero / segundoNumero));
                }
                break;
            default:
                System.out.println("Operação inválida. Escolha um número entre 1 e 4.");
        }
        
        scanner.close();
    }
}
