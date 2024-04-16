package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPor favor escolha uma opção:");
            System.out.println("1. Mercado - Compra");
            System.out.println("2. Mercado - Compra com Desconto");
            System.out.println("3. Nota Final do Aluno");
            System.out.println("4. Calculadora");
            System.out.println("5. Venda Imóvel");
            System.out.println("6. Encerra Programa");
            System.out.println("7. Soma de Valores");
            System.out.println("8. Divisão de Valores");
            System.out.println("9. Tabuada");
            System.out.println("10. Média do Aluno");
            System.out.println("11. Bloqueio de Usuário");
            System.out.println("12. Valores Ímpares");
            System.out.println("13. Busca Nome");
            System.out.println("14. Excluir Nomes");
            System.out.println("15. Sair");
            System.out.print("Digite sua escolha: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Mercado - Compra");
                    Mercado.run();
                    System.exit(0);
                case 2:
                    System.out.println("Mercado - Compra com Desconto:");
                    MercadoDesconto.run();
                    System.exit(0);
                case 3:
                    System.out.println("Nota Final do Aluno:");
                    NotaFinal.run();
                    System.exit(0);
                case 4:
                    System.out.println("Calculadora:");
                    Calculadora.run();
                    System.exit(0);
                case 5:
                    System.out.println("Venda Imóvel:");
                    VendaImovel.run();
                    System.exit(0);
                case 6:
                    System.out.println("Encerra Programa:");
                    DezChecker.run();
                    System.exit(0);
                case 7:
                    System.out.println("Soma de Valores:");
                    SomaDeValores.run();
                    System.exit(0);
                case 8:
                    System.out.println("Divisão de Valores:");
                    DivisaoDeValores.run();
                    System.exit(0);
                case 9:
                    System.out.println("Tabuada:");
                    Tabuada.run();
                    System.exit(0);
                case 10:
                    System.out.println("Média do Aluno:");
                    MediaDoAluno.run();
                    System.exit(0);
                case 11:
                    System.out.println("Bloqueio de Usuário:");
                    BloqueioDeUsuario.run();
                    System.exit(0);
                case 12:
                    System.out.println("Valores Ímpares:");
                    NumerosImpares.run();
                    System.exit(0);
                case 13:
                    System.out.println("Busca Nome:");
                    BuscaNome.run();
                    System.exit(0);
                case 14:
                    System.out.println("Excluir Nomes:");
                    ExcluirNome.run();
                    System.exit(0);
                case 15:
                    System.out.println("Fechando o programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
