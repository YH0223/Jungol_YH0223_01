package Adv_2468;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num=Long.parseLong(br.readLine());
		br.close();
		long biggernum=SameBigger(num);
		long smallernum=SameSmaller(num);
		System.out.printf("%d %d",smallernum,biggernum);
	}
	
	public static Long SameSmaller(long num) {
	    String numStr = "0"+Long.toBinaryString(num); // 입력 숫자를 2진수 문자열로 변환
	    char[] binary = numStr.toCharArray(); // 수정 가능한 문자 배열로 변환
	    
	    for (int i = binary.length - 1; i > 0; i--) {
	        // '10' 패턴을 찾아 '01'로 변경
	        if (binary[i] == '0' && binary[i - 1] == '1') {
	            // 스왑: '10' -> '01'
	            binary[i] = '1';
	            binary[i - 1] = '0';
	            
	            // 뒷부분을 가능한 한 큰 값으로 만들어 더 작은 값 보장
	            StringBuilder sb = new StringBuilder();
	            sb.append(binary, 0, i); // 앞부분 유지
	            int zeros = 0, ones = 0;
	            for (int j = i; j < binary.length; j++) {
	                if (binary[j] == '1') ones++;
	                else zeros++;
	            }
	            // 뒷부분에 '1'을 먼저 배치하고 '0'을 채움
	            for (int j = 0; j < ones; j++) sb.append('1');
	            for (int j = 0; j < zeros; j++) sb.append('0');
	            
	            return Long.parseLong(sb.toString(), 2); // 2진수 문자열을 10진수로 변환
	        }
	    }
	    return 0L; // 더 작은 숫자가 없으면 null 반환
	}
	
	public static Long SameBigger(long num) {
	    String numStr = "0"+Long.toBinaryString(num); // 입력 숫자를 2진수 문자열로 변환
	    char[] binary = numStr.toCharArray(); // 수정 가능한 문자 배열로 변환
	    
	    for (int i = binary.length - 1; i > 0; i--) {
	        // '01' 패턴을 찾아 '10'로 변경
	        if (binary[i] == '1' && binary[i - 1] == '0') {
	            // 스왑: '01' -> '10'
	            binary[i] = '0';
	            binary[i - 1] = '1';
	            
	            // 뒷부분을 가능한 한 작은 값으로 만들어 더 정확한 값 보장
	            StringBuilder sb = new StringBuilder();
	            sb.append(binary, 0, i); // 앞부분 유지
	            int zeros = 0, ones = 0;
	            for (int j = i; j < binary.length; j++) {
	                if (binary[j] == '1') ones++;
	                else zeros++;
	            }
	            // 뒷부분에 '0'을 먼저 배치하고 '1'을 채움
	            for (int j = 0; j < zeros; j++) sb.append('0');
	            for (int j = 0; j < ones; j++) sb.append('1');
	           
	            
	            return Long.parseLong(sb.toString(), 2); // 2진수 문자열을 10진수로 변환
	        }
	    }
	    return 0L;
	}
}

	
	