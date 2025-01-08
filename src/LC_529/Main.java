package LC_529;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int OBG=B+100-A;
		System.out.println(OBG);
		if(OBG>0) {
			System.out.println("Obesity");
		}
	}
}
 