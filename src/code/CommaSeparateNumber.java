package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CommaSeparateNumber {

	public static void main(String[] args) {
		System.out.println(format(123456789,"En"));
	}

	public static String format(int num,String locale){
		LocaleMap local = new LocaleMap();
		HashSet<Integer> code = local.getStyleList(locale);
		int step= 0;
		StringBuilder ret = new StringBuilder();

		while (num > 0){
			if (code.contains(step))
				ret.append(",");
			ret.append(num %10);
			step ++;
			num /= 10;
		}
		return ret.reverse().toString();
	}
}

class LocaleMap{
	private Map<String,HashSet<Integer>> localeList;
	
	public LocaleMap(){
		localeList = new HashMap<>();
		Integer[] enCodes = {3,6,9,12};
		HashSet<Integer> en = new HashSet<>(Arrays.asList(enCodes));
		Integer[] inCodes = {3, 5, 7, 9, 11, 13};
		HashSet<Integer> in = new HashSet<>(Arrays.asList(inCodes));
		localeList.put("En", en);
		localeList.put("In", in);
	}
	
	public HashSet<Integer> getStyleList(String locale){
		return localeList.get(locale);
	}
}
