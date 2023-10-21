import java.util.Scanner;
public class Pythagouras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of triangle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int Max = a;
        if(b>= Max){
            Max = b;
        }
        if(c>=Max){
            Max = c;
        }
        if(Max == a){
            boolean flag = ((b*b+c*c) == (a*a));
            System.out.println("this is a right triangle"); 
        }
        else if(Max == b){
             boolean flag = ((a*a+c*c) == (b*b));
            System.out.println("this is a right triangle");

        }
        else{
             boolean flag = ((b*b+a*a) == (c*c));
            System.out.println("this is a right triangle");
        }
        sc.close();
    }
    
}
