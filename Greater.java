import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = s.nextDouble();
        System.out.println("Enter the second number");
        double num2 = s.nextDouble();
        System.out.println("Enter the third number");
        double num3 = s.nextDouble();
        double max = Math.max(num1,Math.max(num2,num3));
        System.out.println("the greater number is :" +max);
        s.close();
    }
    
}
