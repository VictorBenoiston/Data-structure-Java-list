package Question_46;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileCounter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("texto.txt");
        Scanner scannerFile = new Scanner(file);
        Scanner scannerTxt = new Scanner(System.in);



        Map<String, Integer> mapaPalavras = new HashMap<>();

        while (scannerFile.hasNext()) {
            String palavra = scannerFile.next().toLowerCase();

            if (mapaPalavras.containsKey(palavra)) {
                int freq = mapaPalavras.get(palavra);
                mapaPalavras.put(palavra, freq + 1);
            } else {
                mapaPalavras.put(palavra, 1);
            }
        }

        scannerFile.close();


        for (String palavra : mapaPalavras.keySet()) {
            int freq = mapaPalavras.get(palavra);
            System.out.println(palavra + ": " + freq);
        }

        // Escolhendo o nome do arquivo de output:
        System.out.println("Insira o nome que deseja salvar o arquivo: ");
        String nomeArquivo = scannerTxt.nextLine();

        scannerTxt.close();
        String nomeArquivoBin = (nomeArquivo + ".bin");
        String nomeArquivoTxt = (nomeArquivo +  "-frequencia.txt");


        // Salvando em .bin:
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nomeArquivoBin));
        outputStream.writeObject(mapaPalavras);
        outputStream.close();

        // Salvando as frequencias em .txt:
        PrintWriter printWriter = new PrintWriter(nomeArquivoTxt);
        for (String palavra : mapaPalavras.keySet()) {
            int freq = mapaPalavras.get(palavra);
            printWriter.println(palavra + ": " + freq);
        }
        printWriter.close();
    }
}
