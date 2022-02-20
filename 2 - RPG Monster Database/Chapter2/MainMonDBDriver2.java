import java.util.Scanner;

public class MainMonDBDriver2 {

	public static void main(String[] args) {

		Scanner inputDevice = new Scanner(System.in);

		MonsterDatabase2DB monsterDB = new MonsterDatabase2DB();
		monsterDB.insert(new Monster2("MERMAID", 120, 200));
		monsterDB.insert(new Monster2("MARTIAL CAT", 220, 100));
		monsterDB.insert(new Monster2("DRAGON", 300, 250));

		System.out.println("WELCOME TO THE FANTASY RPG MONSTER DATABASE!" + '\n'
				+ "there are already 3 monster species loaded into the database" + '\n'
				+ "press enter to go to the main menu");
		inputDevice.nextLine();

		boolean userIsFinished = false;
		while (!userIsFinished) {
			System.out.println("MONSTER SPECIES DATABASE MENU:" + '\n' + "* press 1 to add a species to the database"
					+ '\n' + "* press 2 to delete a species from the database" + '\n'
					+ "* press 3 to change an existing species' data" + '\n'
					+ "* press 4 to search for an individual species' data" + '\n'
					+ "* press 5 for a readout of the database" + '\n' + "* press 6 to exit the program");

			int answer = inputDevice.nextInt();
			inputDevice.nextLine();

			switch (answer) {
			case 1:
				Monster2 tempMon = new Monster2();
				tempMon.input();
				if (monsterDB.insert(tempMon)) {
					System.out.println("Monster added to database" + '\n' + "press enter to return to menu");
					inputDevice.nextLine();
				}
				break;
			case 2:
				System.out.println(
						"what is the name of the monster species that you would like to remove from the database");
				String tempName = inputDevice.nextLine().toUpperCase();
				if (monsterDB.delete(tempName)) {
					System.out.println(tempName + " removed from database" + '\n' + "press enter to return to menu");
					inputDevice.nextLine();
				} else {
					System.out.println(tempName + " not found in database" + '\n' + "press enter to return to menu");
				}
				break;
			case 3:
				System.out.println("what monster's info would you like to update?");
				String monToUpdate = inputDevice.nextLine().toUpperCase();
				Monster2 tempMon2 = new Monster2();
				tempMon2.updateInput(monToUpdate);
				if (monsterDB.update(monToUpdate, tempMon2)) {
					System.out.println("entry has been updated");
					System.out.println("press enter to return to menu");
					inputDevice.nextLine();
				} else {
					System.out.println(monToUpdate + " isn't in the database" + '\n' + "press enter to return to menu");
					inputDevice.nextLine();
				}
				break;
			case 4:
				System.out.println("give the name of a monster species to see their stats");
				tempName = inputDevice.nextLine().toUpperCase();
				System.out.println(monsterDB.fetch(tempName));
				System.out.println("press enter to return to the menu");
				inputDevice.nextLine();
				break;
			case 5:
				monsterDB.printAll();
				System.out.println("press enter to return to menu");
				inputDevice.nextLine();
				break;
			case 6:
				userIsFinished = true;
				break;
			default:
				System.out.println("please choose a number 1-6" + '\n' + "press enter to return to menu");
				inputDevice.nextLine();
			}
		}

	}
}
