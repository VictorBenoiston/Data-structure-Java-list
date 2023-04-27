import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o valor do aporte inicial: R$");
                double aporteInicial = scanner.nextDouble();

                System.out.print("Digite o valor do investimento mensal: R$");
                double aporteMensal = scanner.nextDouble();

                System.out.print("Digite a quantidade de meses do investimento: ");
                double quantidadeMeses = scanner.nextDouble();

                System.out.print("Digite a aliquota de juros mensal (%): ");
                double taxaJurosMensal = scanner.nextDouble();

                double saldoAcumulado = aporteInicial;
                double rendimentoMensal;

                for (int i = 1; i <= quantidadeMeses; i++) {
                    rendimentoMensal = (saldoAcumulado + aporteMensal) * (taxaJurosMensal / 100);
                    saldoAcumulado = saldoAcumulado + aporteMensal + rendimentoMensal;
                }

                System.out.printf("O rendimento mensal da poupança após " + quantidadeMeses + " meses é de R$ %.2f.", saldoAcumulado);

            }
        }
