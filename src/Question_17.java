import java.util.Scanner;

public class Question_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero inicial: ");
        double numeroI = scanner.nextDouble();
        System.out.print("Digite o numero final: ");
        double numeroF = scanner.nextDouble();

        if(numeroI > numeroF){
            System.out.println("O número Inicial não pode ser maior que o final.");
        }else{
            if(numeroI % 2 == 0){
                numeroI ++;
            }

            // While:
            while(numeroI <= numeroF){
                System.out.print(numeroI + " ");
                numeroI += 2;
            }


            // Do-While:
//            do {
//                System.out.print(numeroI + " ");
//                numeroI ++;
//            }while (numeroI <= numeroF);


            // For:
            for(double c = numeroI; numeroI <= numeroF; numeroI++ ){
                System.out.print(numeroI + " ");
            }
        }

    }
}
