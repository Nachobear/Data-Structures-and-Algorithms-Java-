import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		// create an array of 100 numbers 1-200 no repeats

		int[] numbers = new int[100];

		getNumbers(0, 0, numbers);
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " " + numbers[i] + "\n");
		}
		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

		Node root = new Node(numbers);
		System.out.println("sorted array is listed above\n");

		System.out.println("a tree has been created consisting of 100 integer nodes" + "\nthey range from 1-200");
		int answer = 1;
		while (answer != 0) {
			System.out.println("type an int(1-200) and press enter to see if it is in the tree (0 to quit)");
			answer = inputDevice.nextInt();
			inputDevice.nextLine();

			boolean exists = ifNodeExists(root, answer);
			if (exists) {
				System.out.println("int is in the tree!");
			} else {
				System.out.println("not in tree");
			}

		} // end of while

	}// end of main

	private static int[] getNumbers(int p, int i, int[] numbers) {
		if (i < 100 && i >= 0) {
			p = p + new Random().nextInt(2) + 1;
			numbers[i] = p;
			getNumbers(p, i + 1, numbers);
			return numbers;
		} else {
			return numbers;
		}
	}

	static boolean ifNodeExists(Node node, int answer) {
		if (node == null)
			return false;

		if (node.getValue() == answer)
			return true;

		// then recur on left subtree /
		boolean existsLeft = ifNodeExists(node.getLeftChild(), answer);

		// node found, no need to look further
		if (existsLeft)
			return true;

		// node is not found in left,
		// so recur on right subtree /
		boolean existsRight = ifNodeExists(node.getRightChild(), answer);

		return existsRight;
	}
}