import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = s.nextInt();
        String[] result = {"Even","Odd"};
        System.out.println(result[number%2]);
        s.close();
    }
}
