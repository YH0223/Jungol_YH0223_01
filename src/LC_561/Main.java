package LC_561;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        int[] arr=new int[10];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(bf.readLine());
        int max100=1, min100=9999;
        for(int i=0;i<10;i++) {
        	arr[i]=Integer.parseInt(st.nextToken());
        }
        if(arr[0]>=100) {
        	max100=100;
        }else if(arr[9]<=100) {
        	 min100=100;
        }
        for(int k: arr) {
            if(k<100&&k>max100) {
            	max100=k;
            }else if(k>=100&&k<min100) {
            	min100=k;
            }
        }
        System.out.println(max100+" "+min100);
        
    }
}

