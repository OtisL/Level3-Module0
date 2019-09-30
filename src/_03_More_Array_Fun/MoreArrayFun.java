package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] strings = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh"};
		print(strings);
		System.out.println("///");
		printReverse(strings);
		System.out.println("///");
		printOther(strings);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void print(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printReverse(String[] array) {
		for(int i=array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printOther(String[] array) {
		for(int i=0; i<array.length; i+=2) {
			System.out.println(array[i]);
		}
	}
}
