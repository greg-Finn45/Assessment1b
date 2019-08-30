package co.grandcircus;
import java.util.Scanner;


public class Assessment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userOrder = 0; 
		String foodServing = null;
		float subTotal = 0;
		float userTotal = 0;
		int burgerCount = 0;
		int sodaCount = 0;
		boolean rerun = true;
		
		System.out.println("Welcome to Grand Circus' Online Restaurant!\n");
		
		
		do {
			System.out.println("Please enter '1' for burger, '2' for soda, or '3' to exit: ");
			userOrder = scan.nextInt();			

			if (userOrder < 1 || userOrder > 3) {
				System.out.println("Sorry I didn't understand, let's try again.\n");		
			}
			
			else {	
				if(userOrder == 1) {
					foodServing = "burger";
					subTotal+=2.25;
					burgerCount++;
					
				}
				else if(userOrder == 2) {
					foodServing = "soda";
					subTotal+=1.25;
					sodaCount++;	
					
				}
				else if(userOrder == 3) {
					foodServing = "exit";
					break;
					
				}
			}
			
		} while(rerun);
		
		
		System.out.println("Subtotal = " + subTotal + "\n" + "Total = " + (subTotal * 0.07 + subTotal));
		
		System.out.print("Burgers: ");
		for (int i = 1; i <= burgerCount; i++) {
			System.out.print("*");
		}
		
		System.out.print("\nSoda: ");
		for (int i = 1; i <= sodaCount; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n\nThank you for shopping with us!");
		
		
		scan.close();	
	}

}
