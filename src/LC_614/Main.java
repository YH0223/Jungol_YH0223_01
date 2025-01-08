package LC_614;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		School sch1=new School();
		Scanner sc = new Scanner(System.in);
		School sch2=new School(sc.next(),sc.nextInt());
		System.out.printf("%d grade in %s School\n",sch1.getGrade(),sch1.getSchName());
		System.out.printf("%d grade in %s School",sch2.getGrade(),sch2.getSchName());
	

	}

}

class School{
	private String schname;
	private int grade;
	
	public School() {
		grade=6;
		schname="Jejuelementary";
	}
	
	public School(String schname,int grade) {
		this.schname=schname;
		this.grade=grade;
	}
	
	public String getSchName() {
		return schname;
	}
	
	public int getGrade() {
		return grade;
	}
	
	
}