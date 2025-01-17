package ex_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int[] res;
	static int num1,num2;
	public static void main(String[] args) throws IOException {
		// 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(bf.readLine());
        num1=Integer.parseInt(st.nextToken());
        num2=Integer.parseInt(st.nextToken());
        res=new int[num1];
        bt(0);
        
        bf.close();
	}
	
	public static void bt(int p) {
		// 종료 조건
		if (p == num1) {
			for (int i = 0; i < res.length; i++) {
				System.out.print((res[i] + 1) + " ");
			}
			System.out.println();
			return;
		}

		// 재귀
		for (int i = 0; i < num2; i++) {
			res[p] = i;
			bt(p + 1);
		}
	}
}
