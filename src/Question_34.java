import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        Map<String, Integer> palavras = new HashMap<>();

        String[] arrayPalavras = frase.split(" ");
        for (String palavra : arrayPalavras) {
            if (palavras.containsKey(palavra)) {
                palavras.put(palavra, palavras.get(palavra) + 1);
            } else {
                palavras.put(palavra, 1);
            }
        }

        System.out.println("As palavras e quantas vezes foram ditas foram: ");
        for (String palavra : palavras.keySet()) {
            System.out.println(palavra + " = " + palavras.get(palavra));
        }
    }
}
