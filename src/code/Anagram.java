package code;

public class Anagram {
	
	
/**
 * @param a
 * @param b
 * @return
 * 
 * Check if anagram
 * return difference to calculate how many words to be changed to make anagram
 * this can be done by returning difference instead of bool
 */
static boolean isAnagram(String a, String b) {
        
        int[] charSeq1= getcharSeq(a.toLowerCase());
        int[] charSeq2= getcharSeq(b.toLowerCase());
        
        int difference=0;
        
        for(int i=0;i<charSeq1.length;i++){
            difference+= Math.abs(charSeq1[i]-charSeq2[i]);
        }
        return difference==0?true:false;
        
        
    }

    static int[] getcharSeq(String a){
        int [] array= new int [26];
        for(int i= 0;i<a.length();i++){
            int offset = (int) 'a';
            int val =  a.charAt(i) - offset;
            array[val]++;
        }
        return array;
    }
}
