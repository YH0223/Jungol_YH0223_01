package LC_564;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> ArrayInput=new ArrayList<>();
        StringTokenizer st=new StringTokenizer(bf.readLine());
        while(true) {
        	String temp=st.nextToken();
        	char charTemp = temp.charAt(0); // 첫 번째 문자를 추출
        	int tempI = (int) charTemp;
        	if(tempI<65||tempI>90) {
        		break;
        	}
        	ArrayInput.add(temp);
        }
        Collections.sort(ArrayInput);
        Map<String,Integer> ans=new HashMap<>();
        int cnt=1;
        for (int i = 1; i <ArrayInput.size() ; i++) {
            if(!ArrayInput.get(i).equals(ArrayInput.get(i-1))) { //오름차순이므로 이전값과 같으면 cnt++
            	ans.put(ArrayInput.get(i-1),cnt);
            	cnt=1;
            }
            else {
            	cnt++;
            }
        }
        ans.put(ArrayInput.get(ArrayInput.size() - 1), cnt);
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(ans.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));

        for (Entry<String, Integer> entrySet : list) {	
        	System.out.println(entrySet.getKey() + " : " + entrySet.getValue());	
        }
        // 자원 정리 및 출력
        bw.flush();
        bw.close();
        bf.close();
    }

}