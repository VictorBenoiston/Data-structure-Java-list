import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question_35 {
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

        try {
            FileWriter writer = new FileWriter("outputQ35.csv");
            writer.write("palavra: quantidade\n");
            for (String palavra : palavras.keySet()) {
                writer.write(palavra + ": " + palavras.get(palavra) + "\n");
            }
            writer.close();
            System.out.println("Resultado salvo em outputQ35.csv.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o resultado em outputQ35.csv: " + e.getMessage());
        }

        System.out.print("Deseja exibir o conteúdo do arquivo resultado.csv? (S/N) ");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            try {
                File arquivo = new File("outputQ35.csv");
                Scanner leitor = new Scanner(arquivo);
                while (leitor.hasNextLine()) {
                    System.out.println(leitor.nextLine());
                }
                leitor.close();
            } catch (IOException e) {
                System.out.println("Erro ao abrir o arquivo outputQ35.csv: " + e.getMessage());
            }
        }
    }
}
