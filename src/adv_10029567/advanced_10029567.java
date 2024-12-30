package adv_10029567;
import java.util.Scanner;
import java.lang.Math;

public class advanced_10029567 {
	public static void main(String[] args){
        int result=0;
        Scanner sc = new Scanner(System.in);
		System.out.println("8비트 2진수 입력");
		String num = sc.next();
        if(num.length()!=8){
            System.out.println("error");
        }else{
            if(num.charAt(0)=='1') {
            	result-=(int)Math.pow(2, num.length()-1);
            }
            for(int i=1;i<num.length();i++) {
            	if(num.charAt(i)=='1') {
            		result+=(int)Math.pow(2, num.length()-(i+1));
            	}
        	}
        }
        System.out.println(result);
        
    }
}
