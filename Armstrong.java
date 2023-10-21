import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        int arm=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int c = n;
        while(n>0){
            int res = n%10;
            arm = (res*res*res)+arm;
            n=n/10;
        }
if(c==arm){
    System.out.println("entered number is armstrong number");
}
else{
    System.out.println("Entered number is not a armstrong number");
}
sc.close();
    }
}