package LC_601;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[]args)  throws IOException {
		// 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input=bf.readLine();
        int cnt=input.length()-1;
        for(int i=0;i<input.length();i++) {
        	
        	for(int j=0;j<input.length();j++) {
        		int temp=cnt+j;
        		if(temp>input.length()-1) {
        			temp=temp%input.length();
        		}

        		System.out.print(input.charAt(temp));
        	}
        	cnt--;
        	System.out.println();
        }
	}
}
