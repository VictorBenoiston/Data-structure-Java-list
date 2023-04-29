import java.util.Scanner;

public class Question_37 {
    //Checar o final do programa para os pros e cons de cada.

    // Utilizando Recursividade:
    public static int somatorioRecursivo(int comecoIntervalo, int fimIntervalo) {
        if (comecoIntervalo > fimIntervalo) {
            return 0;
        } else {
            return comecoIntervalo + somatorioRecursivo(comecoIntervalo + 1, fimIntervalo);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial do intervalo: ");
        int comecoIntervalo = scanner.nextInt();
        System.out.print("Digite o número final do intervalo: ");
        int fimIntervalo = scanner.nextInt();

        int soma = 0;

        // Utilizando a repetição for:


        for (int c = comecoIntervalo; c <= fimIntervalo; c++) {
            soma += c;
        }
        System.out.println("Soma utilizando o for: " + soma);

        int somaRecursividade = somatorioRecursivo(comecoIntervalo, fimIntervalo);
        System.out.println("Soma com revursividade: " + somaRecursividade);

    }
}


/*
 For:
 - Pontos positivos: É a implementaçao mais fácil de ser feita; mais fácil de ser lida; mais abrangente; é a implementação mais eficiente.
 - Pontos negativos: Além de não ser elegante ou escalável, trabalha com mais variáveis, como o incremento, o contador, etc.
 Recursividade:
 - Pontos positivos: Como todo programa que usa abordagem recursiva, é mais escalável, e mais elegante que um laço de repetição; Resolve casos em que
 apenas a revursividade resolve.
 -Pontos negativos: Como todo programa recursivo, é mais complexo de se entender e consequentemente, debugar; Dependendo do problema, vem a ser menos eficiente.
*/

