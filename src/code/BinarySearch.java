package code;

public class BinarySearch {

	public static void main(String[] args) {
		int array[] = { 21, 32, 43, 74, 75, 86, 97, 108, 149 };
		int num = 30;
		binarySearch(array,num);

	}

	public static void binarySearch(int[] inputArray,int num){
		if (inputArray == null || inputArray.length == 0) {
			return ;
		}
		int start=0;
		int end = inputArray.length-1;
		while(start<=end){
			int mid=(start+end)/2;
			if(inputArray[mid]==num){
				System.out.format("number %d found",num);
				return;
			}
			else if(inputArray[mid]>num){
				end=mid-1;
			}
			else if(inputArray[mid]<num){
				start=mid+1;
			}
		}
		System.out.format("number %d not found",num);
	}

}
