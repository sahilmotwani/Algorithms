package code;

import java.util.HashSet;


public class IntersectionOfLinkedList {

	
	private static int checkInsert(Nodes headA, Nodes headB){

	    // Complete this function
	    // Do not write the main method. 
	    if(headA==null || headB==null)
	        return 0;
	    HashSet<Nodes> list1 = new HashSet<>();
	    while(headA!=null){
	        list1.add(headA);
	        headA=headA.next;
	    }
	    while(headB!=null){
	        if(list1.contains(headB))
	            return headB.data;
	        headB=headB.next;
	    }
	    return 0;

		
	}
}

class Nodes {
    int data;
    Nodes next;
 }