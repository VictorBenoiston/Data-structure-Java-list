import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question_40 {

    private static final String arquivoEntrada = "texto.txt";
    private static final String arquivoCodificado = "codificado.txt";
    private static final String arquivoDecodificado = "decodificado.txt";

    private static final char[] ORIGINAL = {'Z', 'E', 'N', 'I', 'T'};
    private static final char[] CODIFICADO = {'P', 'O', 'L', 'A', 'R'};

    public static void main(String[] args) {
        codificar(arquivoEntrada, CODIFICADO);
        decodificar(CODIFICADO, arquivoDecodificado);
    }

    private static void codificar(String entrada, char[] codificado) {
        try {
            Scanner scanner = new Scanner(new File(entrada));
            PrintWriter printWriter = new PrintWriter(new File(arquivoCodificado));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                linha = linha.toUpperCase();

                for (int i = 0; i < ORIGINAL.length; i++) {
                    linha = linha.replace(ORIGINAL[i], codificado[i]);
                }

                printWriter.println(linha);
            }

            scanner.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void decodificar(char[] codificado, String saida) {
        try {
            Scanner scanner = new Scanner(new File(arquivoCodificado));
            PrintWriter printWriter = new PrintWriter(new File(saida));

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                linha = linha.toUpperCase();

                for (int i = 0; i < codificado.length; i++) {
                    linha = linha.replace(codificado[i], ORIGINAL[i]);
                }

                printWriter.println(linha);
            }

            scanner.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

