import java.util.Scanner;

public class Question_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite  um número de 1 a 5: ");
        int numero = scanner.nextInt();

        if(numero > 0 & numero < 6){
            switch (numero){
                case 1:
                    System.out.println("O número digitado foi: Um");
                    break;
                case 2:
                    System.out.println("O número digitado foi: Dois");
                    break;
                case 3:
                    System.out.println("O número digitado foi: Tres");
                    break;
                case 4:
                    System.out.println("O número digitado foi: Quatro");
                    break;
                case 5:
                    System.out.println("O número digitado foi: Cinco");
                    break;
            }
        }else{
            System.out.println("Valor inválido");
        }
    }
}
