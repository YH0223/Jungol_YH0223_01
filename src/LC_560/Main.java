package LC_560;

import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[] input=new int[10];
        for(int i=0;i<10;i++){
        	input[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(input);
        System.out.println(input[0]);
    }
}