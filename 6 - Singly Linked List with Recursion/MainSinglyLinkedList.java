import java.util.Scanner;

public class MainSinglyLinkedList {

	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		SinglyLinkedList pokemon = new SinglyLinkedList();
		Listing l1 = new Listing("Bulbasaur", "seed pokemon", "[grass][poison]");
		Listing l2 = new Listing("Ivysaur", "seed pokemon", "[grass][poison]");
		Listing l3 = new Listing("Venosaur", "seed pokemon", "[grass][poison]");
		Listing l4 = new Listing("Charamander", "lizard pokemon", "[fire]");
		Listing l5 = new Listing("Charmeleon", "flame pokemon", "[fire]");
		Listing l6 = new Listing("Charizard", "flame pokemon", "[fire][flying]");
		Listing l7 = new Listing("Squirtle", "tiny turtle pokemon", "[water]");
		Listing l8 = new Listing("Wartortle", "turtle pokemon", "[water]");
		Listing l9 = new Listing("Blastoise", "shellfish pokemon", "[water]");
		Listing l10 = new Listing("Caterpie", "worm pokemon", "[bug]");
		
		pokemon.insert(l10);
		pokemon.insert(l9);
		pokemon.insert(l8);
		pokemon.insert(l7);
		pokemon.insert(l6);
		pokemon.insert(l5);
		pokemon.insert(l4);
		pokemon.insert(l3);
		pokemon.insert(l2);
		pokemon.insert(l1);
		System.out.println("driver program entered 10 listing objects (pokemon) into the database");
		System.out.println("press enter to call the showAll() method");
		inputDevice.nextLine();
		pokemon.showAll();
		System.out.println("Press enter to continue");
		inputDevice.nextLine();
		System.out.println("fetching (Blastoise)\n");
		System.out.println(pokemon.fetch("Blastoise"));
		System.out.println("updating (Charmeleon)'s species with (chameleon pokemon)");
		Listing l11 = new Listing("Charmeleon", "chameleon pokemon", "[fire]");
		pokemon.update("Charmeleon", l11);
		System.out.println("deleting (caterpie)\n");
		pokemon.delete("Caterpie");
		System.out.println("Press enter to call the showAll() method again");
		inputDevice.nextLine();
		pokemon.showAll();
		System.out.println("Press enter to call the showAllRecursive() method");
		inputDevice.nextLine();
		pokemon.showAllRecursive();
		System.out.println("\nPress enter to end the program");
		inputDevice.nextLine();
		System.exit(0);

	}

}