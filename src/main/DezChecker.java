package main;
import java.util.Scanner;

public class DezChecker {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
        } while (numero != 10);

        scanner.close();
    }
}