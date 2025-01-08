package LC_593;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int input;
		for(;;) {
			System.out.print("ASCII code =? ");
			input=sc.nextInt();
			if(input<33||input>127) {
				break;
			}
			System.out.println((char)input);
		}
		
		
		
	}
}