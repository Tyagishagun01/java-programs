import java.util.Scanner;

public class Pattern7{
	private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		int i, j;
		
		System.out.print("Please Enter Right Arrow Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Right Arrow Pattern of Stars");
		
		for (i = 0 ; i < rows; i++ ) 
		{
			for (j = 0 ; j < rows; j++ ) 
			{
				if(j < i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for (i = 2 ; i <= rows; i++ ) 
		{
			for (j = 0 ; j < rows; j++ ) 
			{
				if(j < rows - i) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}