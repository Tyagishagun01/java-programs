public class PerimeterRect {
    public static void main(String[] args) {
        double width = 5.0;
        double height = 3.0;

        double perimeter = calculateRectanglePerimeter(width, height);

        System.out.println("Perimeter of the rectangle is: " + perimeter);
    }

    
    public static double calculateRectanglePerimeter(double width, double height) {
        
        return 2 * (width + height);
    }
}