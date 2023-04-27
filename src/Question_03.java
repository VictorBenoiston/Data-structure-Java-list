import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double number2 = scanner.nextDouble();


        System.out.println("Adição: " + (number1 + number2));
        System.out.println("Subtração: " + (number1 - number2));
        System.out.println("Multiplicação: " + (number1 * number2));
        System.out.println("Divisão: " + (number1 / number2));
        System.out.println("Resto: " + (number1 % number2));

    }
}

