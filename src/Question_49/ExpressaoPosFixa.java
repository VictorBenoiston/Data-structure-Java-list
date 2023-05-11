package Question_49;

import java.util.Scanner;
import java.util.Stack;

public class ExpressaoPosFixa {
    public static double calcular() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a expressão pós-fixa (Ex: 2 5 + 4 * 2 /): ");
        String expressao = scanner.nextLine();

        Stack<Double> pilha = new Stack<Double>();
        String[] tokens = expressao.split(" ");

        for (String token : tokens) {
            if (isNumero(token)) {
                pilha.push(Double.parseDouble(token));
            } else {
                double op2 = pilha.pop();
                double op1 = pilha.pop();
                double resultado = calcularOperacao(token.charAt(0), op1, op2);
                pilha.push(resultado);
            }
        }

        return pilha.pop();
    }

    private static boolean isNumero(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double calcularOperacao(char operador, double op1, double op2) {
        switch (operador) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '%':
                return op1 % op2;
            case '^':
                return Math.pow(op1, op2);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }

    public static void main(String[] args) {
       double resultado =  calcular();
        System.out.println(resultado);
    }
}
