import java.util.Scanner;
public class Nprimeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  range");
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count = 0;
        for(int n = low; n <= high; n++){
            for(int div = 2; div*div<= n; div++){
                if(n % div == 0)
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println(n);
        }
        sc.close();
    }
    
}
