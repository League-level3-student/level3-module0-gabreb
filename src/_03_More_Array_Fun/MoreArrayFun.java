package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.

	public static void main(String[] args) {
		String[] names = new String[7];
		names[0] = "a";
		names[1] = "b";
		names[2] = "c";
		names[3] = "heheheheh";
		names[4] = "e";
		names[5] = "f";
		names[6] = "g";
		random(names);
	}

	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.

	public static void Stringconverter(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	public static void reverseStringconverter(String[] strings) {
		for (int i = strings.length - 1; i > -1; i--) {
			System.out.println(strings[i]);
		}
	}

	public static void everyOther(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			if (i % 2 == 0) {
				System.out.println(strings[i]);
			}
		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.

	public static void random(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			for (int z = 0; z < 100; z++) {
				int rayray = new Random().nextInt(strings.length);
				int rayrad = new Random().nextInt(strings.length);
				String happy;
				happy = strings[rayray];
				strings[rayray] = strings[rayrad];
				strings[rayrad] = happy;
			}
		}
		for (int y = 0; y < strings.length; y++) {
			System.out.println(strings[y]);
		}
	}
}
// 5. Write a method that takes an array of Strings and prints all the Strings
// in the array
// in a completely random order. Almost every run of the program should result
// in a different order.
