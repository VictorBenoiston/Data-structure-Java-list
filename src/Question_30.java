import java.util.Scanner;

public class Question_30 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();

        String newString = "";

        for (int c = string.length() - 1; c >= 0; c--){
            newString += string.charAt(c);
        }

        System.out.printf("A palavra %s ao contrário é: %s", string, newString);
        }
    }
