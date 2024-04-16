package main;

import java.util.Scanner;

public class BuscaNome {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Informe o nome a ser buscado: ");
        String nomeBusca = scanner.nextLine();

        boolean achou = false;
        int posicao = -1;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                achou = true;
                posicao = i;
                break;
            }
        }

        if (achou) {
            System.out.println("Nome encontrado na posição: " + (posicao + 1));
        } else {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        run();
    }
}
