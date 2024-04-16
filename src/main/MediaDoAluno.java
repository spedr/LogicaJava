package main;
import java.util.Scanner;

public class MediaDoAluno {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Digite a primeira nota: ");
            double primeiraNota = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double segundaNota = scanner.nextDouble();

            double media = (primeiraNota + segundaNota) / 2;
            System.out.printf("A média final é: %.1f\n", media);

            if (media >= 7) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            while (true) {
                System.out.print("Deseja realizar um novo cálculo? (Sim/Não): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("Sim")) {
                    break;
                } else if (resposta.equalsIgnoreCase("Não")) {
                    scanner.close();
                    return;
                } else {
                    System.out.println("Entrada inválida. Por favor, digite 'Sim' ou 'Não'.");
                }
            }
        }
    }
}
