package code;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author sahil
 * think of the array as two. Reverse 1st and 2nd parts and then reverse the whole array
 * {1,2,3,4,5,6,7} and k=3
 * Step 1 {4,3,2,1,7,6,5}
 * Step 2 reverse whole array {5,6,7,1,2,3,4}
 */
public class RotateArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		int k=3;
		rotate(arr,k);
		System.out.println(Arrays.toString(arr));
	}

	public static void rotate(int[] arr,int rot){
		if(arr.length==0 || arr==null){
			System.out.println("Illegal argument");
		}
		//use only if asked
		if(arr.length<rot){
			rot=rot%arr.length;
		}
		int j=arr.length-1;
		reverse(arr,0,j-rot);
		reverse(arr,arr.length-rot,j);
		reverse(arr,0,j);

	}
	public static void reverse(int[] arr,int start,int end){
		while(start<end){
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
