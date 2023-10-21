import java.util.Scanner;
public class CircleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius = s.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.println("The area of circle is:" +area);
        s.close();
    }
    
}
