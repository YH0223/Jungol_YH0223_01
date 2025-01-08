package LC_558;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] inputArray=input.split(" ");
		for(int i=inputArray.length-1;i>=0;i--) {
			if(!inputArray[i].equals("0")) {
				System.out.print(inputArray[i]+" ");
			}
		}
	}
}