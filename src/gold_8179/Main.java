package gold_8179;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		int countN=Integer.parseInt(bf.readLine());
		StringTokenizer st;
		
		for(int i=0;i<countN;i++) {
			int countTemp=Integer.parseInt(bf.readLine());
			int[]temp=new int [countTemp];
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<countTemp;j++) {
				temp[j]=Integer.parseInt(st.nextToken());
			}
			
		}
		
		bf.close();
	}
}
