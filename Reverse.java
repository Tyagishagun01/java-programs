import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while(n!=0){
            int dig = n%10;
            n = n/10;
            System.out.println("reverse digits are:" +dig);
        }
        sc.close();
    }
    
}
