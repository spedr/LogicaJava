package main;

import java.util.Scanner;

public class MercadoDesconto {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do produto: ");
        String nomeProduto = scanner.nextLine();
        
        System.out.print("Preço do produto (R$): ");
        double preco = scanner.nextDouble();
        
        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();
        
        double total = preco * quantidade;
        double desconto = 0;
        
        if (quantidade > 50) {
            desconto = total * 0.25;
        } else if (quantidade >= 21) {
            desconto = total * 0.20;
        } else if (quantidade >= 11) {
            desconto = total * 0.10;
        }
        
        double totalComDesconto = total - desconto;
        
        System.out.println("\nResumo da Compra:");
        System.out.printf("Produto: %s\n", nomeProduto);
        System.out.printf("Preço Unitário: R$ %.2f\n", preco);
        System.out.printf("Quantidade: %d\n", quantidade);
        System.out.printf("Total sem desconto: R$ %.2f\n", total);
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        System.out.printf("Total com desconto: R$ %.2f\n", totalComDesconto);
        
        scanner.close();
    }
}

