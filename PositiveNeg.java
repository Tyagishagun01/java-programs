import java.util.Scanner;
public class PositiveNeg {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        String result = checkNumber(number);

        System.out.println("The entered number is " + result);

        scanner.close();
    }

    public static String checkNumber(double number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}

