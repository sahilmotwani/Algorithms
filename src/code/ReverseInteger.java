package code;

public class ReverseInteger {

	public static void main(String[] args) {

		System.out.println(reverseInt(1234));
	}
	
	public static int reverseInt(int num){
		
		int reverseNum=0;
		int n=0;
		while(num!=0){
			int tail= num%10;
			reverseNum=n*10+tail;
			//to check if overflow, return 0 in that case	
			if((reverseNum-tail)/10!=n){
				return 0;
			}
			num/=10;
			n=reverseNum;
		}
		return reverseNum;
	}

}
