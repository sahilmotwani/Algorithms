package code;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> queue = new LinkedList();
	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		int i=10;
		//10 9 8 7 6 5 4 3 2 1
		while(i>0){
			s.push(i); 
			i--;
		}
		//1
		s.pop();
		//2
		s.pop();
		//3
		s.peek();
	}

	public  void push(int num){
		queue.add(num);
	}
	
	public  void pop(){
		if(queue.isEmpty()){
			return;
		}
		for(int i=0;i<queue.size()-1;i++){
			queue.add(queue.poll());
		}
		queue.poll();
	}
	
	public  void peek(){
		if(queue.isEmpty()){
			return;
		}
		for(int i=0;i<queue.size()-1;i++){
			queue.add(queue.poll());
		}
		System.out.println(queue.peek());
	}
}
