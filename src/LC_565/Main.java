package LC_565;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args)  throws IOException {
		// 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr=new int[10];
        StringTokenizer st=new StringTokenizer(bf.readLine());
        for(;;) {
        	String temp=st.nextToken();
        	if(Integer.parseInt(temp)==0) {
        		break;
        	}
        	int temp10=Integer.parseInt(temp)/10;
        	
        	arr[temp10]++;
        }
        for(int k=0;k<arr.length;k++) {
        	if(arr[k]!=0) {
        		bw.write(k+" : "+arr[k]+"\n");
        	}
        }
        bw.flush();
        bw.close();
        bf.close();
	}
}