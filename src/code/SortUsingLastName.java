package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortUsingLastName {

	public static void main(String[] args) {
		String [] arr= {"Daenerys Targaryen", "Jon Snow", " Tyrion Lannister", " Joffrey Baratheon","Samaly Lannister"};
		sortLast(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	public static void sortLast(String[] arr){
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				String[] split1= o1.split(" ");
				String[] split2 = o2.split(" ");
				String firstName1= split1[0];
				String firstName2= split2[1];
				String lastName1= split1[0];
				String lastName2= split2[1];
				int result=lastName1.compareTo(lastName2);
				if(result!=0)
					return result;
				return firstName1.compareTo(firstName2);
			}
		});
	}
}
