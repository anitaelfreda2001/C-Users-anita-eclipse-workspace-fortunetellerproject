import java.util.Scanner;

public class Main {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.println("How old are you");

		int userAge = 22;

		int legalVotingAge = 18;

		if (userAge >= legalVotingAge) {
			System.out.println("Hooray you can vote");
		} else {
			System.out.println("sorry not old enougSh to vote");
			;

		}

		// String Methods

		String myName = "Anita";
		System.out.println(myName.toUpperCase());
input.close();
	}
}