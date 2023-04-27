import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        Map<Character, Integer> letras = new HashMap<>();

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letras.containsKey(letra)) {
                letras.put(letra, letras.get(letra) + 1);
            } else {
                letras.put(letra, 1);
            }
        }
        System.out.println("Quantidade de letras na palavra: ");
        for (char letra : letras.keySet()) {
            System.out.println(letra + " = " + letras.get(letra));
        }
    }
}
