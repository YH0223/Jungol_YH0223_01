package expert_1357;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] matrix;
	static int cnt=0;
	public static void main(String[] args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int countN=Integer.parseInt(bf.readLine());
		StringTokenizer st;
		matrix=new int[4][countN];
		for(int i=0;i<countN;i++) {
			st=new StringTokenizer(bf.readLine());
			for(int j=0;j<4;j++) {
				matrix[j][i]=Integer.parseInt(st.nextToken());
				}
		}
		dp(countN);
		System.out.println(cnt);
		bf.close();
	}
	public static void dp(int countN) { 
		//4열을 모두 비교하기엔 복잡하다. 2열 2열씩 더한 값을 두개의 배열에 저장.
		//즉 countN^2의 크기의 1차원 배열 2개 생성
		//두 배열에 대해서 값의 합이 0인 값 탐색
		int[] first2col=new int[countN*countN];
		int[] last2col=new int[countN*countN];
		int temp=0;
		for(int i=0; i<countN;i++) {
			for(int j=0;j<countN;j++) {
				int f2=matrix[0][i]+matrix[1][j];
				int l2=matrix[2][i]+matrix[3][j];
				first2col[temp]=f2; //첫 두개 더한값
				last2col[temp]=l2; //뒷 두개 더한값
				temp++;
			}
		}	

		Arrays.sort(first2col);Arrays.sort(last2col); // -- or ++은 계산 필요 x
		for(int i=0; i<countN*countN;i++) {
			for(int j=0;j<countN*countN;j++) {
				if((first2col[i]<0&&last2col[j]<0)||(first2col[i]>0&&last2col[j]>0)) {
					continue;
				}else if((first2col[i]+last2col[j]==0)){
					cnt++;
				}
			}
		}
		
        
	}

}
