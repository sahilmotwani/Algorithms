package code;

import java.util.Arrays;

public class RemoveDuplicateSortedArray {

	
	//Do it in constant memory
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,6,7,8,8};
		int index=removeDuplicates(nums);
		}

	
	 public static int removeDuplicates(int[] nums) {
	       if (nums == null || nums.length == 0){
	           return 0;
	       }
	       int index = 1;
	       for (int i = 1; i < nums.length; i++){
	           if (nums[i] != nums[i - 1]){
	               nums[index++] = nums[i];
	           }
	       }
	       return index;
	}
}
