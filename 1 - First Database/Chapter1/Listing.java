import java.util.Scanner;

public class Listing {

	private String name;
	private int age;

	public Listing() {
		name = "";
		age = 0;
	}

	public Listing(String tempName, int tempAge) {
		name = tempName;
		age = tempAge;
	}

	public String toString() {
		return (this + this.name + this.age);
	}

	public void input(int count) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("what is person" + count + "'s name?");
		this.name = inputDevice.nextLine();
		System.out.println("what is person" + count + "'s age?");
		this.age = inputDevice.nextInt();
		inputDevice.nextLine();
	}

	public void setName(String tempName) {
		this.name = tempName;
	}

	public void setAge(int tempAge) {
		this.age = tempAge;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

}