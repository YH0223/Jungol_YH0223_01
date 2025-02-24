package LC_568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[]args) throws IOException {
		 // 입력용 BufferedReader, 출력용 BufferedWriter 초기화
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		
		int[][] matrixA= new int[2][4];
		StringTokenizer st;
		for(int i=0;i<4;i++) {
			if(i==0) {
				bw.write("first array\n");
			}else if(i==2) {
				bw.write("second array\n");
			}
			st= new StringTokenizer(bf.readLine());
			if(i<4) {
				for(int j=0;j<4;j++) {
					matrixA[i][j]=Integer.parseInt(st.nextToken());
				}
			}else {
				for(int j=0;j<4;j++) {
					matrixA[i-4][j]*=Integer.parseInt(st.nextToken());
					bw.write(String.valueOf(matrixA[i-4][j])+" ");
				}
				bw.write("\n");
			}
		}
		
		
		bw.flush();
		bf.close();
		bw.close();
	}

}
