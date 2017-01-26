package code;

import java.util.Scanner;

public class MakePalindrome {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<num;i++){
            String s = scan.nextLine();
                System.out.println(checkPalindrome(s));
        }
     scan.close();  
    }
    
    public static int checkPalindrome(String word){
        
        int start = 0;
        int end=word.length() -1;
        int index=0;
        while(start<end){
            if(word.charAt(start)==word.charAt(end)){
                start++;
                end--;
            }
            else{
                if(word.charAt(start+1)==word.charAt(end) && 
                		word.charAt(start+2)==word.charAt(end-1)){
                    index=start;
                    return index;
                }
                else if(word.charAt(start)==word.charAt(end-1)
                		&& word.charAt(start+1)==word.charAt(end-2)){
                    index=end;
                    return index;
                }
            }
         }
        return -1;
    }

}
