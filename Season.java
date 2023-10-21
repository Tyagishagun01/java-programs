import java.util.Scanner;
public class Season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         while(true){
            System.out.println("enter the month number");
            System.out.println("winter-1: Spring-2: Summer-3: Autumn-4: ");
            int choice = sc.nextInt();
            
            switch(choice){
                case 11:
                case 12:
                case 1:
                case 2:
                System.out.println("for month number the season is Winter");
                break;
                case 3:
                case 4:
                case 5:
                System.out.println(" for enetered month number season is Spring");
                break;
                case 6:
                case 7:
                case 8:
                System.out.println("for entered month number season is Summer");
                break;
                case 9:
                case 10:
                System.out.println(" season is Autumn");
                break;
                default:
                System.out.println("invalid choice");
            }
            sc.close();
    }
    
}
}