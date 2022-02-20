import java.util.Scanner;

public class Monster2 {
	private String speciesName;
	private int attack;
	private int health;
	Scanner inputDevice = new Scanner(System.in);
	
	public Monster2() {
		
	}
	
	public Monster2(String sN, int a, int h) {
		speciesName = sN;
		attack = a;
		health = h;
	}
	
	public String toString() {
		return("speciesName: " + speciesName + '\n' + "attack: " + attack + '\n' + "health: " + health + '\n');
	}
	
	public Monster2 deepCopy() {
		Monster2 clone = new Monster2(speciesName, attack, health);
		return clone;
	}
	
	public int compareTo(String targetKey) {
		return(speciesName.compareTo(targetKey));
	}
	
	public void input() {
		System.out.println("what is the name of the new monster species?");
		speciesName = inputDevice.nextLine().toUpperCase();
		System.out.println("what is " + speciesName + "'s attack stat?");
		attack = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.println("what is " + speciesName + "'s health points");
		health = inputDevice.nextInt();
		inputDevice.nextLine();
	}
	
	public void updateInput(String monToUpdate) {
		System.out.println("what should " + monToUpdate + "'s new name be?");
		speciesName = inputDevice.nextLine().toUpperCase();
		System.out.println("what should " + speciesName + "'s attack be?");
		attack = inputDevice.nextInt();
		inputDevice.nextLine();
		System.out.println("what should " + speciesName + "'s health points be?");
		health = inputDevice.nextInt();
		inputDevice.nextLine();
	}
	
	public String getName() {
		return this.speciesName;
	}

}