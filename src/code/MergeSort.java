package code;

import java.util.Arrays;

/**
 * @author sahil
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[]  a = {2,4,6,16,1,3,6,7,8};
		mergeSort(a); 
		System.out.println(Arrays.toString(a));
		
	}


	//merge the left and right subarray to parent array
	public static void merge(int[] left, int[] right, int[] array){
		int l= left.length;
		int r= right.length;
		int i = 0,j = 0,k=0;
		while(i<l && j<r){
			if(left[i]<=right[j]){
				array[k] = left[i];
				k++;
				i++;
			}else{
				array[k]=right[j];
				k++;
				j++;
			}
		}
		while(i<l){
			array[k++]=  left[i++];
		}
		while(j<r){
			array[k++]=  right[j++];
		}
	}
	
	public static void mergeSort(int[] array){
		int size = array.length;
		//if size =1 we dont need to partition as array has one element so we just return
		if(size<2){
			return;
		}
		
		//create two arrays by partitioning
		int mid= size/2;
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for(int i=0;i<mid;i++){
			left[i]= array[i];
		}
		for(int i=mid; i<size;i++){
		right[i-mid] = array[i];
		}
		mergeSort(left);
		mergeSort(right);
		merge(left, right, array);
	}
}
