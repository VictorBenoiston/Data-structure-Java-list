import java.util.Scanner;

public class Question_13 {
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
            double quartaProva = (55 - (6 * mediaParcial) - 5) / 4;
            System.out.printf("Você precisa de um: " + "%.2f", quartaProva);
        }else{
            System.out.println("\nReprovado!");
        }
    }
}
