import java.util.Scanner;
public class Plaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String reverse = "";
        String num = sc.nextLine();
        int length = num.length();
        for(int i=length-1; i >=0;i--)
        reverse = reverse+num.charAt(i);
        if(num.equals(reverse))
        {
            System.out.println("Entered string is plaindrome");
        }
        else{
            System.out.println("Entered string is not a plaindrome string");
        }
        sc.close();

    }
    
}