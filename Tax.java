import java.util.Scanner;
public class Tax { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        if(salary<=10000){
            System.out.println("No tak amount");
        }
        else if(salary>=10000 && salary<=20000){
            System.out.println("you have to pay 10% tax amount:" +0.10*salary);
        }
        else if(salary>=20000 && salary<=30000){
            System.out.println("you have to pay 15% tax amount:" +0.15*salary);
        }
        else if(salary>=30000){
            System.out.println("you have to pay 25% tax amount:" +0.25*salary);
        }
        sc.close();
    }
    
}
