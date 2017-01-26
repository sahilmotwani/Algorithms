package code;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {

		int[] array = {0, 1, 0, 3, 12};
		move(array);
		System.out.println(Arrays.toString(array));
	}
	
	public static void move(int[] array){
		if(array.length==0 || array==null){
			return;
		}
		int zero=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==0){
				zero+=1;
			}
			else{
				array[i-zero]=array[i];
			}
		}
		
		for(int i=array.length-1;i>array.length-1-zero;i--){
			array[i]=0;
		}
		
	}

	
}
