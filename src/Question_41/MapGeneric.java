package Question_41;

import java.util.*;

public class MapGeneric<T, U> {
    public static void main(String[] args) {
        // Exemplo de HashMap com Generic
        Map<String, Integer> palavraPagina = new HashMap<>();
        palavraPagina.put("Amar", 1);
        palavraPagina.put("Bater", 6);
        palavraPagina.put("Racionalizar", 25);
        palavraPagina.put("Zebra", 39);
        System.out.println("--- Exemplo de HashMpap com Generic --- ");
        for (String palavra : palavraPagina.keySet()){
            System.out.println("A palavra: " + palavra + " está na página: " + palavraPagina.get(palavra));
        }

        Map<String, Double> valorItens = new LinkedHashMap<>();
        valorItens.put("Sabonete", 1.99);
        valorItens.put("Palito de Dente", 0.98);
        valorItens.put("Shampoo", 27.11);
        valorItens.put("Peito de Frango", 19.99);
        System.out.println("\n--- Exemplo LinkedHashMap com Generic ---");
        for (String item : valorItens.keySet()){
            System.out.println(item + " = R$" + valorItens.get(item));
        }

        Map<String, Integer> casaArea = new TreeMap<>();
        casaArea.put("Casa do Rio", 120);
        casaArea.put("Casa da Reserva", 39);
        casaArea.put("Apartamento Centro", 45);
        casaArea.put("Casa das Alfazemas", 200);
        System.out.println("\n--- Exemplo TreeMap com Generic ---");
        for (String casa : casaArea.keySet()){
            System.out.println(casa + " possui " + casaArea.get(casa) + "m2");
        }
    }
}
