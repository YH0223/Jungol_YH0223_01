package LC_616;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Triangle tri=new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt(),
        		sc.nextInt(),sc.nextInt(),sc.nextInt());
        tri.calcCentroid();
    }
}

class Triangle{
	private int x1,x2,x3,y1,y2,y3;
	private double centroid;
	Triangle(int x1, int y1, int x2, int y2, int x3, int y3){
		this.x1=x1;this.x2=x2;this.x3=x3;this.y1=y1;this.y2=y2;this.y3=y3;
	}
	
	public void calcCentroid() {
		int sumX=x1+x2+x3,sumY=y1+y2+y3;
		System.out.printf("(%.1f, %.1f)",sumX/3.0,sumY/3.0);
	}
	
}