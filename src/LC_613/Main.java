package LC_613;

import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Example ex = new Example();
		Scanner sc = new Scanner(System.in);
		ex.Setname(sc.next());
		ex.Setschool(sc.next());
		ex.Setgrade(sc.next());
		System.out.println("Name : "+ ex.Getname());
		System.out.println("School : "+ ex.Getschool());
		System.out.println("Grade : "+ ex.Getgrade());
	}

}

class Example{
	private String name;
	private String school;
	private String grade;
	
	public void Setname(String name) {
		this.name=name;
	}
	public void Setschool(String school) {
		this.school=school;
	}
	public void Setgrade(String grade) {
		this.grade=grade;
	}
	public String Getname() {
		return name;
	}
	public String Getschool() {
		return school;
	}
	public String Getgrade() {
		return grade;
	}
}
