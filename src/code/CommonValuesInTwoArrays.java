package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CommonValuesInTwoArrays {

	public static void main(String[] args){
		Integer [] array1 = {1,3,6,7,8,30,37,56};
		Integer [] array2 = {10,17,92,60,1,4,5,6,30,87,22};
		ArrayList<Integer> a;
		if(array1.length>array2.length){
			a = findIntersection(array1,array2);
		}
		else{
			a = findIntersection(array2,array1);
		}
		for(int out : a){
			System.out.format("%d ",out);
		}
	}
	
	public static ArrayList findIntersection(Integer[] array1,Integer[] array2){
		ArrayList intersection = new ArrayList();
		Set<Integer> bigArray = new HashSet(Arrays.asList(array1));
		for(Integer num : array2){
			if(!bigArray.add(num)){
				intersection.add(num);
			}
		}
		return intersection;
	}
}
