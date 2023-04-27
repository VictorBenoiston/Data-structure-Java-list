import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double number1 = scanner.nextDouble();
        System.out.print("Digite o segundo número (!=0): ");
        double number2 = scanner.nextDouble();
        while (number2 == 0){
            System.out.print("Divisão por zero não suportada. Digite outro número: ");
            number2 = scanner.nextDouble();
        }
        System.out.printf("O quosciente de " + number1 + " / " + number2 + " é de: " + "%.2f", (number1/number2));
    }
}
