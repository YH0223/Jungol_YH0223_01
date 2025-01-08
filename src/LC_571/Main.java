package LC_571;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int outputa=sc.nextInt();
		String input = "~!@#$^&*()_+|\r\n";
		
		ppp(input,outputa);
		
	}
	public static void ppp(String str, int outputA) {
		for(int i=0;i<outputA;i++) {
			System.out.print(str);
		}
	}
}