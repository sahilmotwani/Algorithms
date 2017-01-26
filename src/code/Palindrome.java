package code;

public class Palindrome {

	public static void main(String[] args){
		char [] word = {'a','n','d','n','a'};
		int n=0;
		int i = word.length-1;
		boolean palindrome=true;
		while(i>n){
			if(word[n] != word[i]){
				palindrome= false;
				break;
			}
		i--;n++;
		}
		System.out.println(palindrome);
	}
}
