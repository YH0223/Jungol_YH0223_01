package LC_539;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args) throws IOException {
		  // 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int sum=0,cnt=0;
        while(true) {
        	int temp=Integer.parseInt(st.nextToken());
        	if(temp>99) {
        		sum+=temp;
        		cnt++;
        		break;
        	}
        	sum+=temp;
        	cnt++;
        }
        
        System.out.printf("%d\n%.1f", sum,(double)sum/cnt);
        bf.close();
	}
}
