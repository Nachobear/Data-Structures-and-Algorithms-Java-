import java.util.Random;

public class Character {

	private static String[] weapons = new String[] { "battle harp", "blades", "hammer", "lance", "gunlance",
			"great sword", "long sword", "bow", "insect blade", "sword and shield", "bowgun", "heavy bowgun" };
	private static String[] consonants = new String[] { "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "qu", "r", "s", "t", "v", "w", "x", "y", "z"}; 
    private static String[] vowels = new String[] { "a", "e", "i", "o", "u", "ee", "oo"};
	private static String[] elements = new String[] {"fire", "water", "earth", "wind", "dark", "light"};
	
	private String weapon = weapons[new Random().nextInt(12)];
	
	private String name = consonants[new Random().nextInt(21)] + vowels[new Random().nextInt(7)] + consonants[new Random().nextInt(21)] + vowels[new Random().nextInt(7)];
	
	private String element = elements[new Random().nextInt(6)];
	
	private int level = new Random().nextInt(100);
	
	private int generalNumber;
	

	
	
	public String GetName() {
		return this.name;
	}
	
	public void PrintAll(){
		System.out.println("Name: " + this.name + '\n');
		System.out.println("Weapon: " + this.weapon + '\n');
		System.out.println("Element: " + this.element + '\n');
		System.out.println("Level: " + this.level + '\n' + '\n');
	
		
	}
	
	public void saveGeneralNumber(int number) {
		this.generalNumber = number;
	}
	
	
	public int getGeneralNumber() {
		return this.generalNumber;
	}
	

}