package code;

public class TwoSmallestNumberArray {

	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34,1};
		//int arr[] = {1, 1, 1, 1,1};
		twoSmallest(arr);
	}
	public static void twoSmallest(int [] array){
		int first=Integer.MAX_VALUE;
		int second=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(array[i]<first){
				second=first;
				first=array[i];
			}else if(array[i]<second&& array[i]!=first){
				second=array[i];
			}
		}
		if(second==Integer.MAX_VALUE){
			System.out.format("The first smallest element is %d. There is no second smallest value",first);
			return;
		}
	System.out.format("first and second small numbers are %d and %d",first,second);
	}

}
