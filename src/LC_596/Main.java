package LC_596;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int N=sc.nextInt();
        int K=0;
        if(str.length()>=N) {
        	K=str.length()-N-1;
        }else {
        	K=0;
        }
        for(int i=str.length()-1;i>=K;i--) {
        	{	
        		System.out.print(str.charAt(i)+"");
        	}
        }
    }
}