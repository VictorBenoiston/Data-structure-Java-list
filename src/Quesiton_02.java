import java.util.Scanner;

public class Quesiton_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu nome completo?: ");
        String nomeCompleto = scanner.nextLine();
        System.out.print("Qual a sua idade?: ");
        int idade = scanner.nextInt();
        System.out.print("Qual a sua altura? (em cm): ");
        int altura = scanner.nextInt();
        System.out.print("Qual a primeira letra do seu nome?: ");
        String primeiraLetra = scanner.next();

        System.out.println("Seu nome é: " + nomeCompleto);
        System.out.println("Você tem: " + idade + " anos");
        System.out.println("Você mede: " + altura + "cm");
        System.out.println("A inicial do seu nome é: " + primeiraLetra);
    }
}


