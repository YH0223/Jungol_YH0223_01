package LC_111;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        Subject subject= new Subject(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("sum "+subject.getSUM());
        System.out.println("avg "+subject.getAVG());
    }
}
class Subject{
    private int kr;
    private int en;
    private int math;
    private int cp;
    
    Subject(int kr,int en,int math,int cp){
        this.kr=kr;this.en=en;this.math=math;this.cp=cp;
    }

    int getAVG(){
        int sum=kr+en+math+cp;
        return sum/4;
    }
    int getSUM(){
        int sum=kr+en+math+cp;
        return sum;
    }
}