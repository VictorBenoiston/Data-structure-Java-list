import java.util.Scanner;

public class Question_36 {
    public static int fatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número a ser calculado seu fatorial com recursividade: ");
        int number = scanner.nextInt();

        int resultado = fatorial(number);
        System.out.println(resultado);
    }
}
