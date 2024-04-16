package main;

public class SomaDeValores {
    public static void run() {
        int soma = 0;
        for (int numero = 1; numero <= 100; numero++) {
            soma += numero;
        }
        System.out.println("A soma dos valores de 1 até 100 é: " + soma);
    }
}

