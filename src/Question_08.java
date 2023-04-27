import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual sua altura (ex: 1.71)? ");
        double altura = scanner.nextDouble();
        while (altura == 0){
            System.out.print("O número informado foi 0. Digite outro número: ");
            altura = scanner.nextDouble();
        }
        System.out.print("Qual a sua massa corporal (em kg)?: ");
        double massa = scanner.nextDouble();
        while (massa == 0){
            System.out.print("O número informado foi 0. Digite outro número: ");
            massa = scanner.nextDouble();
        }
        System.out.printf("O IMC foi de: " + "%.2f", (massa/(Math.pow(altura, 2))));
    }
}
