package main;

public class NotaFinal {
    
    public static void run() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota:");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        
        scanner.close();
    }
}

