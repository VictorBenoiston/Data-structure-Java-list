import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double mediaParcial = (n1 + n2 + n3) / 3;

        System.out.printf("Sua média foi: " + "%.2f", mediaParcial);

        if (mediaParcial >= 7){
            System.out.println("\nAprovado!");
        }
        if(mediaParcial >= 3.5 && mediaParcial < 7){
            System.out.println("\nRecuperação!");
        }if(mediaParcial < 5){
            System.out.println("\nReprovado!");
        }
    }
}
