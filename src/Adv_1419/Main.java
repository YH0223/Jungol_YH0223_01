package Adv_1419;
import java.util.Arrays;

import java.util.Scanner;

public class Main {
	public static byte[] getFourLittle(int data){		
		//[4바이트 기준]
		byte[] buf = new byte[4];
		buf[0] = (byte)(data >>>  0);
		buf[1] = (byte)(data >>>  8) ;
		buf[2] = (byte)(data >>> 16);
		buf[3] = (byte)(data >>> 24);	    	    	  
		return buf;	      		 
		}

	
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(Arrays.toString(getFourLittle(num)));
    
    }
	
}
