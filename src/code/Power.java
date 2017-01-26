package code;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2,5));

	}

	public static int power(double x, int p){
		int result =1;

		while(p>0){
			if(p%2==0){
				x*=x;
				p/=2;
			}
			else{
				result*=x;
				p=p-1;
			}
		}
		return result;
	}

}
