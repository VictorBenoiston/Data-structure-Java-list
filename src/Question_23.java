import java.util.Scanner;

public class Question_23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número para descobrir seu fatorial: ");
        int numero = scanner.nextInt();

        int fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
        System.out.println("O resultado foi: " + fatorial);
    }
}
