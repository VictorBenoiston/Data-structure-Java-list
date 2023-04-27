import java.util.Scanner;

public class Question_14 {

    public static double delta(double a, double b, double c){
        double delta = (b * b - 4) * a * c;
        System.out.println("delta: " + delta);
        return delta;
    };
    public static void funcaoSegundoGrau(double a, double b, double c, double delta){
        double x1 = ((b * -1) + Math.sqrt(delta)) / 2 * a;
        double x2 = ((b * -1) - Math.sqrt(delta)) / 2 * a;

        System.out.println("O x1 foi igual a: " + x1 + ". O x2 foi igual a: " + x2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe os coeficientes a, b e c da função de segundo grau:");
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double deltaValue = delta(a, b, c);

        if (deltaValue > 0){
            double x1 = (-b + Math.sqrt(deltaValue)) / (2 * a);
            double x2 = (-b - Math.sqrt(deltaValue)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (deltaValue == 0){
            double x1 = (-b + Math.sqrt(deltaValue)) / (2 * a);
            System.out.println("x1 = " + x1);
        }
        if (deltaValue < 0){
            System.out.println("A função informada não possui raízes reais.");
        }

    }
}
