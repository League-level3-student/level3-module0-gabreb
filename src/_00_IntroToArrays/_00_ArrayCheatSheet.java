package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = new String[5];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		names[3] = "d";
		names[4] = "e";
		// 2. print the third element in the array
		System.out.println(names[2]);
		// 3. set the third element to a different value
		names[2] = "Gaby";

		// 4. print the third element again
		System.out.println(names[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < names.length; i++) {
			names[i] = "Gaby is awesome!";
			System.out.println(names[i]);
		}
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		int[] values = new int[50];
		// 7. make an array of 50 integers
		for (int i = 0; i < values.length; i++) {
			values[i] = new Random().nextInt(1001);
		}
		// 8. use a for loop to make every value of the integer array a random number

		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = values[0];
		for (int i = 1; i < values.length; i++) {
			if (values[i] < smallest) {
				smallest = values[i];
			}
		}
		System.out.println(smallest);

		// 10 print the entire array to see if step 8 was correct
for (int i = 0; i < values.length; i++) {
	System.out.println(values[i]);
}
int largest = values[0];
for (int i = 1; i < values.length; i++) {
	if (values[i] > largest) {
		largest = values[i];
	}
}
System.out.println(largest);
		// 11. print the largest number in the array.
System.out.println(values[49]);
		// 12. print only the last element in the array

	}
}
