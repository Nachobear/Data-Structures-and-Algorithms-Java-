import java.util.Scanner;

public class PersonDatabaseDriver {

	public static void main(String[] args) {
		boolean personIsStillEntering = true;
		int count = 0;
		Listing[] Listings = new Listing[100];
		Scanner inputDevice = new Scanner(System.in);

		while (personIsStillEntering) {
			count++;

			Listings[count - 1] = new Listing();
			Listings[count - 1].input(count);
			boolean answered = false;
			while (answered == false) {
				String answer;
				System.out.println("do you want to enter another person into the database?(y/n)");
				answer = inputDevice.nextLine();
				if (answer.equals("n")) {
					personIsStillEntering = false;
					answered = true;
				} else if (answer.equals("y")) {
					answered = true;
				} else {
					System.out.println("please answer y or n");
				}
			}
		}

		readOut(count, Listings);
		
		changeNamePrompt(Listings);
		
		readOut(count, Listings);
		
		changeAgePrompt(Listings);
		
		readOut(count, Listings);
		
		System.out.println("***end of program***");
	    
		
		
		

	}
	
	private static void readOut(int count, Listing[] Listings) {
		System.out.println("A readout of all the listings:");
		for (int i = count - 1; i > -1; i--) {
			System.out.println("#" + i + " - " + Listings[i].getName() + " - " + Listings[i].getAge() + " years old");
		}
	}
	
	private static void changeNamePrompt(Listing[] Listings) {
		Scanner inputDevice = new Scanner(System.in);
		int answer2;
		System.out.println("if you would like to change any of their names" + '\n' +
				 "type the # of the person you want to change");
		answer2=inputDevice.nextInt();
		inputDevice.nextLine();
		String newName;
		System.out.println("what should " + Listings[answer2].getName() + "'s new name be?");
		
		newName= inputDevice.nextLine();
		Listings[answer2].setName(newName);
	}
	
	private static void changeAgePrompt(Listing[] Listings) {
		Scanner inputDevice = new Scanner(System.in);
		int answer3;
		System.out.println("if you would like to change any of their ages" + '\n' + 
				"type the # of the person you want to change");
		answer3=inputDevice.nextInt();
		inputDevice.nextLine();
		int newAge;
		System.out.println("what should " + Listings[answer3].getName() + "'s new age be?");
		newAge=inputDevice.nextInt();
		inputDevice.nextLine();
		Listings[answer3].setAge(newAge);
	}
}