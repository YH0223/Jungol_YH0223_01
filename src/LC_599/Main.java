package LC_599;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        String newstr="";
        for(int i=0;i<str.length();i++) {
        	if(Character.isAlphabetic(str.charAt(i))) {
        		newstr+=str.charAt(i)+"";
        	}
        }
        System.out.println(newstr.toUpperCase());
    }
}