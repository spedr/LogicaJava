package main;

import java.util.Scanner;

public class Mercado {
    private static Scanner scanner = new Scanner(System.in);

    public static void run() {
        System.out.println("Qual bebida você deseja comprar? (cerveja, refrigerante, água)");
        String bebida = scanner.nextLine().toLowerCase();

        if (bebida.equals("cerveja")) {
            System.out.println("Por favor, informe sua idade:");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if (idade < 18) {
                System.out.println("compra negada");
            } else {
                System.out.println("compra efetuada com sucesso");
            }
        } else if (bebida.equals("refrigerante") || bebida.equals("água")) {
            System.out.println("compra efetuada com sucesso");
        } else {
            System.out.println("Tente novamente.");
        }
    }
}
