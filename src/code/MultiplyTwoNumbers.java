package code;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {

		System.out.println(multiply(35, 2));
	}

	public static int multiply(int a, int b){
		int result = 0;
		while(b>0){
			if((b&1)!=0){
				result +=a;
			}
			a = a << 1;
			b= b>>1;
		}

		return result;
	}

}
