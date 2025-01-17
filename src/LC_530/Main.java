package LC_530;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		
		CheckAdult ca=new CheckAdult(Age);
		ca.printResult();
	}
}

class CheckAdult{
	int age;
	CheckAdult(int age){
		this.age=age;
	}
	void printResult() {
		if(age>=20) {
			System.out.println("adult");
		}else {
			System.out.printf("%d years later", 20-age);
		}
		
	}
}
 