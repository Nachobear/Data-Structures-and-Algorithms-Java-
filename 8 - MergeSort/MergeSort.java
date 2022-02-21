import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("Please make an array to be sorted\nhow many integers are in the array you are making?");
		int answer = inputDevice.nextInt();
		inputDevice.nextLine();
		int[] items = new int[answer];
		System.out.println(
				"enter the numbers in your array one at a time\n(type one int and press enter until the array is full)");
		for (int i = 0; i < answer; i++) {
			int answer2 = inputDevice.nextInt();
			inputDevice.nextLine();
			items[i] = answer2;
		}
		System.out.println("array is full\npress enter to sort and output the array");
		inputDevice.nextLine();
		prepMergeSort(items);
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
		System.out.println("\npress enter to exit the program");
	}

	public static void prepMergeSort(int items[]) {
		int[] temp = new int[items.length];
		mergeSort(items, temp, 0, items.length - 1);
	}

	public static void mergeSort(int items[], int temp[], int leftIndex, int rightIndex) {
		int midIndex, nItems;
		nItems = rightIndex - leftIndex + 1;
		if (nItems == 1)
			return;
		midIndex = (rightIndex + leftIndex) / 2;
		mergeSort(items, temp, leftIndex, midIndex);
		mergeSort(items, temp, midIndex + 1, rightIndex);

		merge(items, temp, leftIndex, midIndex + 1, rightIndex);
		return;
	}

	public static void merge(int items[], int temp[], int leftIndex, int midIndex, int rightIndex) {
		int leftEnd, nItems, tempsIndex;
		leftEnd = midIndex - 1;
		tempsIndex = leftIndex;
		nItems = rightIndex - leftIndex + 1;
		while ((leftIndex <= leftEnd) && (midIndex <= rightIndex)) // both sublists have are not empty
		{
			if (items[leftIndex] <= items[midIndex]) {
				temp[tempsIndex] = items[leftIndex];
				tempsIndex = tempsIndex + 1;
				leftIndex = leftIndex + 1;
			} else {
				temp[tempsIndex] = items[midIndex];
				tempsIndex = tempsIndex + 1;
				midIndex = midIndex + 1;
			}
		} // end while
		if (leftIndex <= leftEnd) // left sublist is not empty
		{
			while (leftIndex <= leftEnd) {
				temp[tempsIndex] = items[leftIndex];
				leftIndex = leftIndex + 1;
				tempsIndex = tempsIndex + 1;
			}
		} // end if
		else {// right sublist is not empty
			while (midIndex <= rightIndex) {
				temp[tempsIndex] = items[midIndex];
				midIndex = midIndex + 1;
				tempsIndex = tempsIndex + 1;
			}
		}
		for (int i = 0; i < nItems; i++) {
			items[rightIndex] = temp[rightIndex];
			rightIndex = rightIndex - 1;
		}
	}// end merge method
}