package main;
import java.util.Scanner;

public class VendaImovel {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        String nomeVendedor = scanner.nextLine();
        
        System.out.print("Digite o valor do imóvel (R$): ");
        double valorImovel = scanner.nextDouble();
        
        double valorComissao;
        
        if (valorImovel >= 50000) {
            valorComissao = valorImovel * 0.20;
        } else if (valorImovel >= 30000) {
            valorComissao = valorImovel * 0.15;
        } else {
            valorComissao = valorImovel * 0.10;
        }
        
        System.out.println("Nome do vendedor: " + nomeVendedor);
        System.out.println("Valor do imóvel: R$ " + String.format("%.2f", valorImovel));
        System.out.println("Valor da comissão: R$ " + String.format("%.2f", valorComissao));
        
        scanner.close();
    }
}
