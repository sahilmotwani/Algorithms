package code;

import java.util.Scanner;

public class PossiblePath {
	public static void main(String[] args) {
		/*Sample input
		 3
		 1 1 2 3
		 2 1 2 3
		 3 3 1 1
		 */    
		/*Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0;i<t;i++){
			int a = scan.nextInt();
			int b= scan.nextInt();
			int c = scan.nextInt();
			int d= scan.nextInt();
			System.out.println(gcd(a,b)==gcd(c,d)?"YES":"NO");
		}*/
		int a=gcd(71,350);
	}

	public static int gcd(int a,int b){
		if(b==0)
			return a;
		int r=a%b;
		return gcd(b,r);
	}
}
