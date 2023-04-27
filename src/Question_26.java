import java.util.Scanner;

public class Question_26 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int linhas = scanner.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor da posição (%d,%d): ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("A matriz digitada foi:");
        for (int i = 0; i < linhas; i++) {
            System.out.println();
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }

    }
}
