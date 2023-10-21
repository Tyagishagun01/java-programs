import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered the number");
        int n = sc.nextInt();
        int count =0;
        for( int div = 2; div*div <= n; div++){
            if(n%div == 0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Entered number is a prime number");
        }
        else{
            System.out.println("Entered number is not a prime number");
        }
        sc.close();
    }
    
}
