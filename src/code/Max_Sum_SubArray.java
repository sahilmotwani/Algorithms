package code;

import java.util.Scanner;

public class Max_Sum_SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        while(n!=0){
        int [] array = new int[scan.nextInt()];
        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
            System.out.println(contiguous(array)+ " "+nonContiguous(array));
        n--;
        }
    }
    
    public static int contiguous( int[] array){
        int current_max=0;
        int max_overall= 0;
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            current_max= current_max+array[i];
            if(current_max<0) current_max=0;
            max_overall=Math.max(current_max,max_overall);
            max_value=Math.max(max_value,array[i]);
        }
        if(max_value<0)
            return max_value;
        return max_overall;
    }
    
    public static int nonContiguous(int[] array){
        int current_max=0;
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            current_max= Math.max(current_max,current_max+array[i]);
            max_value=Math.max(max_value,array[i]);
          }
        if(max_value<0)
            return max_value;
   return current_max;
    }

}
