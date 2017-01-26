package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author sahil
 * Use hashmap to add the occurrences as value and char as key
 * take arrayList of keys and sort using custom comparator where compare using values
 * if values equal then compare using key
 */
public class SortByFrequency {

	public static void main(String[] args) {
		String[] stringArray = {"x", "y", "z", "x", "x", "y","b" ,"c","a"};
		sortByFrequency(stringArray);
		
	}

	public static void sortByFrequency(String[] arr){
		HashMap<String, Integer> map = new HashMap<>();
		for(String s : arr){
			map.put(s, 1 + (map.containsKey(s)?map.get(s):0));
		}
		ArrayList<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list,new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				int a = map.get(o1).compareTo(map.get(o2));
				if(a ==0)
					return o1.compareTo(o2);
				return -a;
			}
		});
		System.out.println(list.toString());
	}
}
