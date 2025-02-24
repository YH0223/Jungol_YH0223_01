package LC_618;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Info[] infos=new Info[5];
        StringTokenizer st;
        for(int i=0;i<5;i++){
        	st=new StringTokenizer(bf.readLine());
            infos[i]=new Info(st.nextToken(),Integer.parseInt(st.nextToken()),
            		Double.parseDouble(st.nextToken()));
        }
        nameDesc(infos);
        System.out.println();
        weightDesc(infos);
     
    }
    
   public static void nameDesc(Info[] infos) {
	// 비교, 정렬
       Arrays.sort(infos, new Comparator<Info>() {
			
    	   @Override
			public int compare(Info info1, Info info2) {
				return info1.name.compareTo(info2.name);
				
			}
		});
       System.out.println("name");
       for(int i=0;i<infos.length;i++) {
       	System.out.printf("%s %d %.1f\n",infos[i].name,infos[i].height,infos[i].weight);
       }
   }
   public static void weightDesc(Info[]infos) {
	// 비교, 정렬
       Arrays.sort(infos, new Comparator<Info>() {
			
			
			@Override
			public int compare(Info info1, Info info2) {
				return Double.compare(info2.weight, info1.weight);
				
			}
		});
       System.out.println("weight");
       for(int i=0;i<infos.length;i++) {
       	System.out.printf("%s %d %.1f\n",infos[i].name,infos[i].height,infos[i].weight);
       }
   }
}

class Info{
    String name;
    int height;
    double weight;

    Info(String name, int height, double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
}