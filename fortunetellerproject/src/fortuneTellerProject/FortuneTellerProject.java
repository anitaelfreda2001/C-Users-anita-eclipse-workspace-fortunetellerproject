package fortuneTellerProject;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class FortuneTellerProject {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = input.nextLine();
		System.out.println("Enter your first last name:");
		String lastName = input.nextLine();
		
		System.out.println("How old are you?:");
		int age = input.nextInt();
		
		System.out.println("What is your birth month, enter month as an integer?:");
		int birthMonth = input.nextInt();
		
           String colour;
		do {
			System.out.println("What is your favorite ROYGBIV color or enter help for a list of ROYGBIV colors:");
			colour = input.next();
			
			if(colour.toLowerCase().equals("help")) {
				System.out.println("The ROYGBIV colours are \nRed\nOrange\nYellow\nGreen\nBlue\nIndigo\nViolet");
			}
		
           } while(colour.toLowerCase().equals("help"));
			
				
           
			
			System.out.println("How many siblings do you have?");
			int numberOfSiblings = input.nextInt();
				
			
		int retirement = 67-age;
		String vacationHome = null;
		
		if(numberOfSiblings<0) {
			vacationHome = "bad location";
		}
			else if(numberOfSiblings==0) {
				vacationHome = "Bahamas";
				
		}
			else if(numberOfSiblings==1) {
				vacationHome = "Cancun";
			}
			else if (numberOfSiblings == 2) {
				vacationHome = "Miami";
			}
			else if (numberOfSiblings>2) {
				vacationHome = "Ohio";
			}
		
		String modeOfTransport = null;
		
		if(colour.toLowerCase().equals("red")) {
			modeOfTransport = "Golf";
			
		}
		else if (colour.toLowerCase().equals("orange")) {
			modeOfTransport = "Nissan";
		}
		
		else if (colour.toLowerCase().equals("yellow")) {
			modeOfTransport = "Kia";
		}
		
		else if (colour.toLowerCase().equals("green")) {
			modeOfTransport = "Horse";
			}
		else if (colour.toLowerCase().equals("blue")) {
			modeOfTransport = "Boat";
		}
		else if (colour.toLowerCase().equals("indigo")) {
			modeOfTransport = "Plane";
		}
		else if (colour.toLowerCase().equals("violet")) {
			modeOfTransport = "Train";
		} 
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		double balance = 0;
		
		if (birthMonth<0 || birthMonth>12) {
			System.out.println("Your balance is " + currency.format(0));
		}
		else {
			balance = 10000*birthMonth;
		}
		
		System.out.println(firstName +" " + lastName + " will retire in " + retirement + "years with " + currency.format(balance) + " in the bank, a vacation home in "  + vacationHome + ", and travel by " + modeOfTransport + ".");
	
           

}
}