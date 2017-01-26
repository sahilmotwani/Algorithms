package code;

public class PivotRotatedArray {

	public static void main(String[] args) {
		int[] rotatedArray = {18,24,28,46,14,15,16,17};
		System.out.print(pivotElement(rotatedArray));
	}

	public static int pivotElement(int[] rotatedArray){

		if(rotatedArray==null || rotatedArray.length==0){
			return -1;
		}
		
		if(rotatedArray.length==1 || rotatedArray[0]<rotatedArray[rotatedArray.length-1]){
			return 0;
		}
		int  start=0;
		int end=rotatedArray.length-1;
		int mid;
		while(start<=end){
			mid=(start+end)/2;
			if(mid<rotatedArray.length && rotatedArray[mid]>rotatedArray[mid+1]){
				return mid+1;
			}
			if(rotatedArray[start]<=rotatedArray[mid]){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
		return 0;
	}
}
