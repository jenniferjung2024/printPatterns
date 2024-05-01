import java.util.Scanner;

public class CSE118Project2 {
	
	public static void printMenu( ) {
		System.out.println("1: Triangle patterns"); 
		System.out.println("2: Pyramid patterns");
		System.out.println("3: Diamond patterns");
		System.out.println("4: Exit");
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome to pattern program.\n");
		printMenu();
		System.out.print(">>> Enter option: ");
		
		Scanner scnr = new Scanner(System.in);
		
		int userOption = scnr.nextInt();
		
		while (userOption < 1 || userOption > 4) {
			System.out.println("Option not valid.\n");
			printMenu();
			System.out.print(">>> Re-enter option: ");
			userOption = scnr.nextInt();
		}
		
		if (userOption == 1) {
			
			System.out.print("Enter a number from 1 to 9: ");
			int userSelection = scnr.nextInt(); 
			
			while (userSelection < 1 || userSelection > 9) {
				System.out.println("Selection not valid.");
				System.out.print(">>> Type a number from 1 to 9: ");
				userSelection = scnr.nextInt();
			}
			
			System.out.println("\n(1A)");

			for (int index = 1; index <= userSelection; ++index) {
				
	            for (int j = 1; j <= index; j++) { 
	                System.out.print(index + " "); 
	            } 
	  
	            // for new line after printing each row 
	            System.out.println();				
			}
			
			
		}
		else if (userOption == 2) {
			
		}
		else if (userOption == 3) {
			
		}
		else if (userOption == 4) {
			System.out.println("Goodbye.");
		}
		
		scnr.close();

	}

}
