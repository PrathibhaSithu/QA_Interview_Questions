package jBegin;
import java.util.Scanner;
public class InputArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array to store the values
        int[] numbers = new int[size];

        // Prompt the user to enter values for each element of the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Display the entered array
        System.out.print("Entered array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Close the Scanner to avoid resource leaks
        scanner.close();

	}

}
