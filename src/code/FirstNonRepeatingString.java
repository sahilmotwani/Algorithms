package code;

public class FirstNonRepeatingString {

	public static void main(String[] args) {
		String string = "ADBCGHIEFKJLADTVDERFSWVGHQWCNOPENSMSJWIERTFB" ;
		getFirstNonRepeating(string);
	}
	
	public static void getFirstNonRepeating(String string){
		if(string.length()==0 || string==null)
			return;
		int offset = (int) 'A';
		int[] charIndx =new int[26];
		for(int i=0;i<charIndx.length;i++){
			charIndx[i]=-1;
		}
		for(int i=0;i<string.length();i++){
			if(charIndx[string.charAt(i)-offset]==-1){
				charIndx[string.charAt(i)-offset]=i;
			}
			else
				charIndx[string.charAt(i)-offset]=-2;
		}
		int minIndx=0;
		for(int i=0;i<charIndx.length;i++){
			if(charIndx[i]>0)
				minIndx=charIndx[i];
		}
		System.out.println(string.charAt(minIndx));
	}

}
