package code;

import java.util.Scanner;

public class TrailingZeroesFactorial {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long[] arr = new long[30];
        for(int i=0;i<6;i++){
            countZeroes(scan.nextLong());
        }
        
    }
    
    public static void countZeroes(long n){
        long count=0;
        for(long i=5;n/i>=1;i*=5){
            count+=n/i;
        }
        System.out.println(n+" "+count);
    }
}
