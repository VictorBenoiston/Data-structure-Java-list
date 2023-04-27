import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da circuferencia: ");
        double raio = scanner.nextDouble();

        double areaTotal = Math.PI * (Math.pow(raio, 2));
        System.out.printf("A área total da circuferência com raio " + raio + " é de: " + "%.2f", areaTotal);
    }
}
