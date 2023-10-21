import java.util.Scanner;
public class SummofDig {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits");
        int number = sc.nextInt();
        int sum = 0;
        int dig;
        int temp = number;
        while(temp!=0){
         dig = temp%10;
            sum += dig;
            temp /= 10;
        }
System.out.println("Entered sum of digits are:" +sum);
sc.close();
    }
    
}
