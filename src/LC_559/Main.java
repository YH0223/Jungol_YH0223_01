package LC_559;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[]args) throws IOException {
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(bf.readLine());
		Score score=new Score();
		score.sum(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		bf.close();
	}
}
class Score{
	private double sum;
	private double[]s= {85.6,79.5,83.1,80.0,78.2,75.0};
	
	void sum(int a, int b) {
		sum+=s[a-1]+s[b-1];
		System.out.println(sum);
	}
}