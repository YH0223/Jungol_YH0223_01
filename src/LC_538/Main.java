package LC_538;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("number ? ");
			char temp=bf.readLine().charAt(0);
			if(temp=='-') {
				System.out.println("negative number");
			}
			else if(temp=='0') {
				break;
			}
			else {
				System.out.println("positive number");
			}
		}
		bf.close();
	}
}
