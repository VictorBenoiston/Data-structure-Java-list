import java.util.Scanner;

public class Question_28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tam = scanner.nextInt();

        int[] vetor = new int[tam];

            for (int i = 0; i < tam; i++) {
                System.out.println("Digite o número da posição " + i + ":");
                vetor[i] = scanner.nextInt();
            }

            int min = vetor[0];
            int max = vetor[0];

            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i] < min) {
                    min = vetor[i];
                } else if (vetor[i] > max) {
                    max = vetor[i];
                }
            }

            System.out.println("O valor mínimo é: " + min);
            System.out.println("O valor máximo é: " + max);
    }
}
