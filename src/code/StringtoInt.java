package code;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.print(atoi(s));
    }
    
    public static int atoi(String str){
        if(str==null|| str.equals(""))
            return 0;
            str=str.trim();
        char [] arr = str.toCharArray();
        boolean isNegative=false;
        int offset = (int) '0';
        int max = (int) '9';
        int num = 0;
        if(str.charAt(0) ==  '-')
            isNegative=true;
        for(int i=0;i<arr.length;i++){
            int temp = (int) arr[i];
            if(temp>= offset && temp<= max){
                num=num*10+(temp-offset);
            }
            else if(!(i==0 &&isNegative))
                return 0;
        }
    
        if(isNegative)
            num=-1*num;
        return num;
    }

}
