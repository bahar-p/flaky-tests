import java.util.Random;

public class EvenOdd {

    public static void main(String[] args) {
        int mix = 6;
        int max = 1;
        String result = even_odd(mix, max);
        System.out.println("Result: " + result);
    }

    public static String even_odd(int min, int max) {
        Random randomNum = new Random();
        int num = min + randomNum.nextInt(max);

        if (num % 2 == 0) {
            System.out.printf("Number %s is even", num);
            return "Even";
        } else {
            System.out.printf("Number %s is odd", num);
            return "Odd";
        }
    }

}
