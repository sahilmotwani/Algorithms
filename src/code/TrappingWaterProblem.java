package code;

public class TrappingWaterProblem {

	public static void main(String[] args) {
		int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		System.out.println(trap(arr));
	}

	public static int trappedWater(int[] arr){
		int num= arr.length;
		int water=0;
		int[] left = new int[num];
		int[] right = new int[num];

		left[0]=arr[0];
		right[num-1]=arr[num-1];
		for(int i=1;i<num;i++){
			left[i]=Math.max(left[i-1],arr[i]);
			}
		for(int i=num-2;i>=0;i--){
			right[i]=Math.max(arr[i], right[i+1]);
		}
		for(int i=0;i<num;i++){
			water+=Math.max(Math.min(left[i],right[i])-arr[i],0);
		}
		return water;
	}
	
	public static int trap(int[] height) {
        if(height == null || height.length==0) return 0;
        int leftMax = 0, rightMax = 0, left = 0, max = 0;
        int right = height.length-1;
        while(left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            max += leftMax < rightMax ? leftMax - height[left++] : rightMax - height[right--];
        }
        return max;
    }
	}
