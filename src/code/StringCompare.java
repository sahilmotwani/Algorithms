package code;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringCompare {

    /**
     * @param args
     * Given a string, find out the lexicographically smallest and largest substring of length k.
     * https://www.hackerrank.com/challenges/java-string-compare
     */
    public static void main(String[] args) {
        String input = "welcometojava";
        int len = 3;
        compareString(input,len);
    }
    public static void compareString(String input,int len){
        String[] ar = new String[input.length()-len+1];
        int j=len;
        for(int i=0;i<input.length()-len+1;i++){
            ar[i]=(input.substring(i,j));
            j++;
        }
        Arrays.sort(ar);
        System.out.println(ar[0]);
        System.out.println(ar[ar.length-1]);
    }
}