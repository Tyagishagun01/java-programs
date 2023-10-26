import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = addition();
                break;
            case 2:
                result = subtraction();
                break;
            case 3:
                result = multiplication();
                break;
            case 4:
                result = division();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double addition() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        return num1 + num2;
    }

    public static double subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        return num1 - num2;
    }

    public static double multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();
        return num1 * num2;
    }

    public static double division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        double dividend = sc.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = sc.nextDouble();

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return Double.NaN; // Return NaN (Not-a-Number) to represent an error.
        }

        return dividend / divisor;
}
}
