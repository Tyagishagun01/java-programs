import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input
        System.out.print("Enter Person Name: ");
        String personName = sc.nextLine();
        System.out.print("Enter Person Gender (male/female): ");
        String personGender = sc.nextLine();
        System.out.print("Enter Person Age: ");
        int personAge = sc.nextInt();
        System.out.print("Enter Person City (Metro/non-metro): ");
        String personCity = sc.next();

        // Calculate Premium
        double premium = calculatePremium(personAge, personGender, personCity);

        if (premium != -1) {
            System.out.println("Premium for " + personName + " is: " + premium + "%");
        } else {
            System.out.println("Not Insured");
        }
    }

    public static double calculatePremium(int age, String gender, String city) {
        if (age >= 25 && age <= 35 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("metro")) {
            return 6.0;
        } else if (age >= 25 && age <= 40 && gender.equalsIgnoreCase("male") && city.equalsIgnoreCase("non-metro")) {
            return 4.0;
        } else if (age >= 25 && age <= 42 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("metro")) {
            return 3.0;
        } else if (age >= 25 && age <= 45 && gender.equalsIgnoreCase("female") && city.equalsIgnoreCase("non-metro")) {
            return 2.0;
        } else {
            return -1; // Not insured
        }
    }
}