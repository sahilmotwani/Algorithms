package code;


/**
 * @author sahil
 * This is to find the average without the min and the max values
 * Find the sum of the array and subtract the min and max from it
 * This would take O(n)
 */
public class AvgWithoutMinMax {
	public static void main(String[] args){
		int arr[] = {12, 13, 1, 10, 34,14};
		System.out.println(average(arr));
	}

	public static double average(int[] arr){
		int min=Integer.MAX_VALUE; int max=0;
		int sum=0;
		if(arr.length<=2){
			return 0;
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
			if(arr[i]>max&& arr[i]!=min){
				max=arr[i];
			}
			sum=sum+arr[i];
		}
		System.out.println(sum+" min:"+min+" max:"+max);
		float avg=((float)sum-min-max)/(arr.length-2);
		return avg;
	}
}
