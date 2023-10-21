import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the digits");
        int c = 0 , s= 0;
        int n = sc.nextInt();
        while(n>0){
            c=n%10;
            n=n%10;
            s=s+c;
        }
        System.out.println("Sum of digits are:" +s);
        sc.close();
    }
}
