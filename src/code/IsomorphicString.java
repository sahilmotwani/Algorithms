package code;

import java.util.HashMap;

public class IsomorphicString {

	public static void main(String[] args) {

		String s = "ab";
        String t = "aa";
        System.out.println(isIsomorphic(s,t));
	}

	public static String isIsomorphic(String a , String b){
		if(a==null || b==null || a.length()!=b.length())
			return "Invalid argument";

		HashMap<Character,Character> map = new HashMap();
		for(int i=0;i<a.length();i++){
			char c1 = a.charAt(i);
			char c2 = b.charAt(i);
			//if seen before, check if mapped with the right character
			if(map.containsKey(c1)){
				if(map.get(c1)!= c2) 
					return "No";
			}
			else {
				if(map.containsValue(c2)) //if char from string 2 already mapped
					return "No";
				map.put(c1, c2);
			}
		}
		return "Yes";
	}

}
