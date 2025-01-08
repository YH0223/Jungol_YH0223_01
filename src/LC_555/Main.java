package LC_555;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray=input.split(" ");
		for(String string:inputArray) {
			System.out.print(string);
		}
	}
}
