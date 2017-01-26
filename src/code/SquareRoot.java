package code;

public class SquareRoot {

	public static void main(String[] args) {
		
		System.out.println(sqrt(-2));
	}

	public static String sqrt(int num){
		boolean isNegative=false;
		if(num <0){
			num=-num;
			isNegative=true;
		}
		if(num==1){
			return num + (isNegative ? "i"  : "" );
		}
		
		double start=0;
		double end=num;
		double mid=(start+end)/2;
		double precision = 0.0005;
		double prevMid=0;
		double diff=Math.abs(mid-prevMid);
		while(mid*mid!=num && diff>precision){
			if(mid*mid>num){
				end=mid;
			}
			else{
				start=mid;
			}
			prevMid=mid;
			mid=(start+end)/2;
			diff=Math.abs(mid-prevMid);
		}
		return mid + (isNegative ? "i"  : "" );
		
	}
}
