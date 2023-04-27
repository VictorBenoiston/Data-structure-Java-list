import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question_27 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tam = scanner.nextInt();

        int[] vetor = new int[tam];

            for (int i = 0; i < tam; i++) {
                System.out.println("Digite o número da posição " + i + ":");
                vetor[i] = scanner.nextInt();
            }

            int c = 0;
            int e = 0;

            System.out.println("O vetor original era: ");

            while (c < vetor.length){
                System.out.print(vetor[c] + " ");
                c ++;
            }

            int[] vetorInverso = new int[vetor.length];
            int j = vetor.length - 1;

            for (int i = 0; i < vetor.length; i++) {
                vetorInverso[i] = vetor[j];
                j--;
            }

            System.out.println("\nO vetor inverso é: ");
            while (e < vetorInverso.length){
                System.out.print(vetorInverso[e] + " ");
                e ++;
            }
    }
}
