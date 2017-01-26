package code;

import java.util.Stack;

public class ReverseSentence {

	public static void main(String[] args) {
		char[] str = "This is a string".toCharArray();
		reverseSentence(str);
		System.out.print(str);
	}
	
	public static void reverseSentence(char[] str){
		int n=str.length;
		int start=0;
		for(int i=0;i<n;i++){
			if(str[i]==' '){
				reverseString(str,start,i);
				start=i+1;
			}else if(i==n-1){
				reverseString(str, start, i);
			}
		}
		reverseString(str, 0, str.length-1);
	}
	
	
	public static void reverseString(char[] a,int start,int end){
		Stack<Character> stack = new Stack();
		for(int i=start;i<=end;i++){
			stack.push(a[i]);
		}
		for(int i=start;i<=end;i++){
			a[i]=stack.pop();
		}
	}

}
