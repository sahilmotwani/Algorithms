package code;

public class TwoLargestInArray {

	public static void main(String[] args) {
		int arr[] = {12, 13, 1, 10, 34,1};
		twoLarge(arr);
	}

	public static void twoLarge(int[] arr){
		int first=0,second=0;
		if(arr.length<2){
			System.out.println("Invalid input");
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>first && arr[i]<second){
				first=arr[i];
			}
			if(arr[i]>second){
				first=second;
				second=arr[i];
			}
		}
		System.out.format("The two largest numbers are %d %d",first,second);
	}
}
