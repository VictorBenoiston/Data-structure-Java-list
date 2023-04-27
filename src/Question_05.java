public class Question_05 {
    public double returnAverage(double number1, double number2, double number3){
        double average = (number1 + number2 + number3) / 3;
        return average;
    }

    public static void main(String[] args) {
        Question_05 obj = new Question_05();
        double resultAverage = obj.returnAverage(4, 5, 10);
        System.out.printf("%.2f", resultAverage);
    }
}
