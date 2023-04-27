import java.util.Scanner;

public class Question_24 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número a ser utilizado: ");
        double numero = scanner.nextDouble();

        System.out.println("Selecione a opção desejada: \n1 - Potencia \n2 - Raiz quadrada \n3 - Fatorial \n0 - Sair.");
        int escolha = scanner.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Qual o índice da potencia?: ");
                int potencia = scanner.nextInt();

                double resultado = numero;

                for (int c = 1; c < potencia; c++){
                    resultado *= numero;
                }
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                double raiz = Math.sqrt(numero);
                System.out.println("Resultado: " + raiz);
                break;

            case 3:
                int fatorial = 1;

                for (int i = 1; i <= numero; i++) {
                    fatorial *= numero;
                }
                System.out.println("O resultado foi: " + fatorial);
                break;

            case 0:
                System.out.println("Finalizado.");
                break;
        }


    }
}
