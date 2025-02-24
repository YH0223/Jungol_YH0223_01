package LC_572;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Circle(sc.nextInt());
        sc.close();
    }

    public static void Circle(int rad){
        double PI=Math.PI;
        System.out.printf("%.2f",rad*rad*PI);
    }
}