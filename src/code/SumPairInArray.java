package code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class SumPairInArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		int n = 7;
		pair(a,n);
	}

	public static void pair(int[] numbers,int n){
		if(numbers.length <2)
			return;
		Set set = new HashSet();
		for(int value: numbers){
			int target = n-value;
			if(!set.contains(target)){
				set.add(value);
			}
			else{
				System.out.format("(%d,%d) %n",value,target);
			}
		}
	}

}
