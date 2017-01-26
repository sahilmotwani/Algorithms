package code;

import java.util.Hashtable;

public class RomanInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("MCDLIII"));
	}

	public static int romanToInt(String s){
		Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
		ht.put('I',1);
		ht.put('X',10);
		ht.put('C',100);
		ht.put('M',1000);
		ht.put('V',5);
		ht.put('L',50);
		ht.put('D',500);

		if(s=="" || s.length()==0){
			return 0;
		}
		int val=0;
		int pre=0;

		for(int i = s.length()-1; i>=0 ; i--){
			int curr = ht.get(s.charAt(i));
			if(curr < pre)
				val-=curr;
			else
				val+=curr;
			pre = curr;
		}
		return val;
	}

}
