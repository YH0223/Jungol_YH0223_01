package LC_617;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String [] args) throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        HeightName[] hns = new HeightName[5];
        StringTokenizer st;
        for(int i=0;i<5;i++) {
        	st=new StringTokenizer(bf.readLine());
        	hns[i]=new HeightName(st.nextToken(),Integer.parseInt(st.nextToken()));
        }
        Shortest(hns);
    }

   
    
    public static void Shortest(HeightName[] hns) {
    	int SIndex=0;
    	int temph=Integer.MAX_VALUE;
    	for(int i=0;i<hns.length;i++) {
    		if(hns[i].height<temph) {
    			temph=hns[i].height;
    			SIndex=i;
    		}
    	}
    	System.out.println(hns[SIndex].name+" "+hns[SIndex].height);
    }
}
class HeightName{
    String name;
    int height;
    
    HeightName(String name, int height){
        this.name=name;
        this.height=height;
    }
}