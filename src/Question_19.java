import java.util.Scanner;

public class Question_19 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número de 1 a 9: ");
                double n = scanner.nextDouble();

                if (n < 1 || n > 9) {
                    System.out.println("Número inválido! Por favor, insira um número de 1 a 9.");
                } else {
                    System.out.println("Tabuada do número " + n + ": ");
                    for (int i = 1; i <= 10; i++) {
                        double resultado = n * i;
                        System.out.println(n + " x " + i + " = " + resultado);
                    }
                }
        }

    }
