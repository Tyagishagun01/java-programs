import java.util.Scanner;
public class RectArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lengthof rectangle");
        double length = s.nextDouble();
        System.out.println("Enter the width of rectangle");
        double width = s.nextDouble();
        double area = length*width;
        System.out.println("The area of rectangle is:" +area);
        s.close();
    }
    
}
