public class Question_04 {
    public int returnAverage(int number1, int number2, int number3){
        int average = (number1 + number2 + number3) / 3;
        return average;
    }

    public static void main(String[] args) {
        Question_04 obj = new Question_04();
        int resultAverage = obj.returnAverage(4, 5, 9);
        System.out.println(resultAverage);
    }
}
