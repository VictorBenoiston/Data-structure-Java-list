import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                String senhaCorreta = "senha123";

                System.out.println("Digite a senha: ");
                String senha = scanner.nextLine();

                // While
//                while (!senha.equals(senhaCorreta)) {
//                    System.out.println("Senha incorreta. Tente novamente: ");
//                    senha = scanner.nextLine();
//                }
//                    System.out.println("Senha correta! Bem-vindo.");


                // Do-While
                do {
                    System.out.println("Digite a senha: ");
                    senha = scanner.nextLine();
                    if (!senha.equals(senhaCorreta)) {
                        System.out.println("Senha incorreta. Tente novamente.");
                    }
                } while (!senha.equals(senhaCorreta));

                System.out.println("Senha correta! Bem-vindo");
            }

    }

