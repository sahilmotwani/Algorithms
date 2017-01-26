package code;

import java.util.Arrays;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		char[] a = "  Hi, how are you?".toCharArray();
		String arr = new String(" Hi , How Are    you ?  ");
		removeExtraSpaces(arr);
		int numspaces=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==' '){
				numspaces+=1;
			}
			else{
				a[i-numspaces]=a[i];
			}
		}
		char[] charArray =Arrays.copyOf(a, a.length-numspaces);
		System.out.println(charArray);
	}
	
	
	public static void removeExtraSpaces(String arr) {
		arr=arr.trim();
		char[] a = arr.toCharArray();
		int numspaces=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==' ' && (a[i+1] == ' '||a[i+1]=='?' || a[i+1]==',' || a[i+1]=='.')){
				numspaces+=1;
			}
			else{
				a[i-numspaces]=a[i];
			}
		}
		char[] charArray =Arrays.copyOf(a, a.length-numspaces);
		System.out.println(charArray);
	}
}
