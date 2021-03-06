import java.util.Scanner;

/*
 * Andrew Calabro Cavin
 * 
 * Use conditional statements to automate the decision-making process
 */
public class ConditionalStatements {

	public static void main(String[] args) {

		int userInput;
		char userChar = 'y'; // set initial condition as yes
		String userName;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Hi! What is your name?");
		userName = scnr.next();

		System.out.println("Ok, " + userName + "!");
		
		while ((userChar == 'y') || (userChar == 'Y')) { // execute if yes

			System.out.println("Please enter an integer between 1 and 100: ");

			userInput = scnr.nextInt();

			if ((userInput < 1) || (userInput > 100)) {
				
				System.out.println("Come on, " + userName + "!");
			}
			
			else {

				if ((userInput % 2) == 0) { // check if even

					if ((userInput >= 2) && !(userInput > 25)) {
						System.out.println("Even and less than 25");
					}

					else if ((userInput >= 26) && !(userInput > 59)) {
						System.out.println("Even");
					} else if (userInput >= 60) {
						System.out.println(userInput + " Even");
					}
					System.out.println();
				}

				else {

					System.out.print(userInput + " Odd");

					if (userInput > 60) {
						System.out.print(" and over 60.");
					}

					System.out.println("\n");
				}

				System.out.println(userName + ", would you like to continue? (y/n)");
				userChar = scnr.next().charAt(0);

				System.out.println();

				if ((userChar == 'n') || (userChar == 'N')) {
					System.out.println("So long, " + userName + "!");
				}
			}
			
			/*
			else {
				System.out.println("Come on, " + userName + ", that is not between 1 and 100!");
			}
			*/
		}
	}
}
