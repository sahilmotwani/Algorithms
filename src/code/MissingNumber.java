package code;

import java.util.Map;
import java.util.TreeMap;

public class MissingNumber {

	public static void main(String[] args) {
		int[] a = {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int b[]={203,204 ,204 ,205 ,206, 207 ,205, 208, 203, 206 ,205, 206, 204};
		findMissing(a, b);
	}
	
	public static void findMissing(int[] a, int[] b){
		if(a.length>b.length){
			findMissing(b, a);
		}
        TreeMap<Integer,Integer> tr = new TreeMap();
        
        for(int i = 0;  i< a.length;i++){
        	int temp=tr.containsKey(a[i])?tr.get(a[i]):0;
            tr.put(a[i],temp+1);
        }
        for(int i = 0;  i< b.length;i++){
        	int temp=tr.containsKey(b[i])?tr.get(b[i]):0;
        	tr.put(b[i],temp-1);
        }
        for(Map.Entry<Integer,Integer> entry : tr.entrySet()) {
            if(entry.getValue().intValue()<0){
                System.out.print(entry.getKey()+" ");
            }
        }
    }

}
