import java.util.Scanner;

public class Question_22 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite um número inteiro > 0: ");
            int numero = scanner.nextInt();

            boolean isPrimo = true;

            if (numero <= 1) {
                isPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        isPrimo = false;
                        break;
                    }
                }
            }

            if (isPrimo) {
                System.out.printf("%d é um número primo.", numero);
            } else {
                System.out.printf("%d não é um número primo.", numero);
            }
        }
    }
