package main;

import java.util.Scanner;

public class BloqueioDeUsuario {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;

        while (tentativas < 3) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals("aluno") && senha.equals("segredo")) {
                System.out.println("Bem vindo!");
                break;
            } else {
                System.out.println("Usuário ou senha incorretos.");
                tentativas++;
            }
        }

        if (tentativas == 3) {
            System.out.println("Conta bloqueada.");
        }

        scanner.close();
    }
}

