package main;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExcluirNome {
    
    public static void run() {
        String[] nomes = {
            "Ana", "Bruno", "Carla", "David", "Eva", 
            "Ana", "Felipe", "Gustavo", "Helena", "Igor", 
            "Júlia", "Kleber", "Luis", "Marta", "Nina", 
            "Oscar", "Paula", "Quintino", "Rita", "Sandro"
        };
        
        Set<String> nomesUnicos = new LinkedHashSet<>();
        for (String nome : nomes) {
            nomesUnicos.add(nome);
        }
        
        for (String nomeUnico : nomesUnicos) {
            System.out.println(nomeUnico);
        }
    }
}

