import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero a ser checado: ");
        double numero = scanner.nextDouble();

        if(numero % 2 == 0){
            System.out.println("O número é par.");
        }else{
            System.out.println("O número é ímpar.");
        }
    }
}
