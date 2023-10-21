import java.util.Scanner;
public class characterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String  str = sc.nextline();
        
        String[] word = str.split("\\+s");
        int count = 0;
                
        System.out.println("digits are:" +str);
        sc.close();
    }
}
