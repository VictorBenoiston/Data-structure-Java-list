import java.util.Scanner;

public class Question_06 {
    public static void billingManager(int qtRefri, int qtPizza, int qtClientes){
        double total = (qtRefri * 1.5) + (qtPizza * 3);
        double gorjeta = (total * 0.1);
        double totalComGorjeta = total + gorjeta;
        double gorjetaPorPessoa = gorjeta / qtClientes;

        System.out.println("O total em consumo foi de: R$" + total);
        System.out.printf("O total da taxa de serviço foi de: R$" + "%.2f", gorjeta);
        System.out.println("\nO total da conta foi de: R$" + totalComGorjeta);
        System.out.printf("Dividindo a taxa de serviço para " + qtClientes + " clientes, cada cliente pagará: " + "%.2f", gorjetaPorPessoa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos clientes?: ");
        int qtClientes = scanner.nextInt();
        System.out.print("Quantos refrigerantes foram consumidos?: ");
        int qtRefri = scanner.nextInt();
        System.out.print("Quantas fatias de pizza foram consumidas?: ");
        int qtPizza = scanner.nextInt();

        Question_06 obj = new Question_06();
        obj.billingManager(qtRefri, qtPizza, qtClientes);
    }
}
