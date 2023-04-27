import java.util.Scanner;

public class Question_25 {
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

            System.out.println("O vetor digitado foi: ");

            while (c < vetor.length){
                System.out.print(vetor[c] + " ");
                c ++;
            }
    }
}
