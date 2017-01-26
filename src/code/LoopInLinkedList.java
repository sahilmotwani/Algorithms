package code;

public class LoopInLinkedList {

	public static void main(String[] args) {
		
		
	}
	
	//Hare and tortoise algorithm. Hare will run faster and catchup with the tortoise
	public boolean hasLoop(Node first){
		if(first==null || first.next==null)
			return false;
		Node fast= first;
		Node slow=first;
		while(fast!=null || fast.next!=null){
			fast=fast.next.next;
			slow=slow.next;
			if(slow==fast){
				return true;
			}
		}
		return false;
	}
	
	 class Node {
	     int data;
	     Node next;
	  }

}
