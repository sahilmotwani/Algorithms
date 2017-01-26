package code;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

	    static Stack<Integer> s1= new Stack();
	    static Stack<Integer> s2= new Stack();
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int times= scan.nextInt();
	        while(times!=0){
	            int step= scan.nextInt();
	            switch(step){
	                case 1:
	                enqueue(scan.nextInt());
	                break;
	                case 2:
	                dequeue();
	                break;
	                case 3:
	                front();
	                break;
	                default:
	                break;
	            }
	            times--;
	        }
	    }
	    
	    public static void enqueue(int num){
	        s1.push(num);
	    }
	    
	    public static void dequeue(){
	        
	        if(!s2.isEmpty()){
	            s2.pop();
	        }
	        else{
	        while(!s1.isEmpty()){
	            s2.push(s1.pop());
	        }
	        s2.pop();
	        }
	    }
	    
	    public static void front(){
	        int front=0; 
	        if(!s2.isEmpty()){
	            front=s2.peek();
	        }
	        else{
	        while(!s1.isEmpty()){
	            s2.push(s1.pop());
	        }
	        front=s2.peek();
	        }
	        System.out.println(front);
	    }

}
