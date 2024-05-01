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
		
		while (userOption != 4) {
			System.out.println("Option not valid.\n");
			printMenu();
			System.out.print(">>> Re-enter option: ");
			userOption = scnr.nextInt();
		}
		
		if (userOption == 1) {
			
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
