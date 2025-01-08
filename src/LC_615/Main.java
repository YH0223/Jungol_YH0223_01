package LC_615;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 String[][] students=new String[2][3];
		 
		 for(int i=0;i<2;i++) {
			 students[i]=bf.readLine().split(" ");
		 }
		 subjectScore[] scores= {
				 new subjectScore(students[0][0],Integer.parseInt(students[0][1]),Integer.parseInt(students[0][2])),
				 new subjectScore(students[1][0],Integer.parseInt(students[1][1]),Integer.parseInt(students[1][2]))		 
		 };
		 int avgE=0,avgK=0;
		 for(int i=0;i<2;i++) {
			 System.out.println(scores[i].getname()+" "+scores[i].getKR()+" "+scores[i].getEN());
			 avgK+=scores[i].getKR();
			 avgE+=scores[i].getEN();
		 }
		 avgE/=2;avgK/=2;
		 System.out.println("avg "+avgK+" "+avgE);
	}
}

class subjectScore {
	private int Korean;
	private int English;
	private String name;
	
	public subjectScore(String name,int Korean, int English) {
		this.name=name;
		this.Korean=Korean;
		this.English=English;
	}
	
	public int getKR() {
		return Korean;
	}
	public int getEN() {
		return English;
	}
	public String getname() {
		return name;
	}
}