import java.util.Stack;
import java.util.Scanner;

public class MainCharacterDriver {

	public static void main(String[] args) {

		Stack<Character> Back = new Stack<Character>();
		Stack<Character> Forward = new Stack<Character>();
		Scanner inputDevice = new Scanner(System.in);
		boolean isDone = false;
		int numberOfGenerals = 0;

		// Exposition
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		System.out.println("You are a demon lord forming an army to wage a war on a neigboring kingdom in your");
		System.out.println("quest for world domination. You are interviewing warriors for the position of ");
		System.out.println("general. You can promote many of them to general rank. A long line of applicants ");
		System.out.println("stands before you. The warrior at the front of the line steps forward...");

		System.out.println();

		while (!isDone) {
			System.out.println("----Applicant:----");
			Character applicant = new Character();
			applicant.PrintAll();

			System.out.println("enter a to approve");
			System.out.println("enter d to dismiss");
			System.out.println("enter r to see a record of approved generals");
			System.out.println("enter x to exit the program");
			String answer = inputDevice.nextLine();

			System.out.println('\n');

			switch (answer) {
			case "a":
				numberOfGenerals++;
				Back.push(applicant);
				applicant.saveGeneralNumber(numberOfGenerals);
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println(applicant.GetName() + " has been appointed to general");
				System.out.println("Next Applicant:");
				break;
			case "d":
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				System.out.println(applicant.GetName() + " has been dismissed");
				System.out.println("Next Applicant:");
				break;
			case "x":
				isDone = true;
				break;
			case "r":
				boolean isDoneWithRecord = false;
				if (!Back.empty()) {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("----Record----");
					applicant = Back.pop();
					Forward.push(applicant);
					System.out.println("--General #" + applicant.getGeneralNumber() + "--");
					applicant.PrintAll();
					System.out.println("enter < or > to see all of the approved generals");
					System.out.println("or use x to exit out of the record");

					while (!isDoneWithRecord) {
						answer = inputDevice.nextLine();
						switch (answer) {
						case "<":
							if (!Back.empty()) {
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								System.out.println("----Record----");
								applicant = Back.pop();
								Forward.push(applicant);
								System.out.println("--General #" + applicant.getGeneralNumber() + "--");
								applicant.PrintAll();
								System.out.println("enter < or > to see all of the approved generals");
								System.out.println("or enter x to exit out of the record");
							} else {
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								System.out.println("----Record----");
								System.out.println("no previous generals");
								System.out.println("\n");
								System.out.println("enter < or > to see all of the approved generals");
								System.out.println("or enter x to exit out of the record");
							}
							break;
						case ">":
							if (!Forward.empty()) {
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								System.out.println("----Record----");
								applicant = Forward.pop();
								Back.push(applicant);
								System.out.println("--General #" + applicant.getGeneralNumber() + "--");
								applicant.PrintAll();
								System.out.println("enter < or > to see all of the approved generals");
								System.out.println("or enter x to exit out of the record");
							} else {
								System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
								System.out.println("----Record----");
								System.out.println("no further generals");
								System.out.println("\n");
								System.out.println("enter < or > to see all of the approved generals");
								System.out.println("or enter x to exit out of the record");
							}
							break;
						case "x":
							for (int i = Forward.size(); i > 0; i--) {
								applicant = Forward.pop();
								Back.push(applicant);
							}
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
							isDoneWithRecord = true;
							break;
						default:
							System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
							System.out.println("please enter a valid response");
							System.out.println("\n");
							System.out.println("enter < or > to see all of the approved generals");
							System.out.println("or enter x to exit out of the record");
							break;
						}
					}
				} else {
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
					System.out.println("there are no generals yet");
					System.out.println("press x to return to the applicant line");
					String answer2 = inputDevice.nextLine();
					if (answer2.equals("x")) {
						isDoneWithRecord = true;
					} else {
						isDoneWithRecord = true;
					}
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				}
			}
		}
	}
}
