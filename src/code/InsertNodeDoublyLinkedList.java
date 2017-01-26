package code;


//Insert in a sorted doubly linkedList
public class InsertNodeDoublyLinkedList {

	NodeDouble SortedInsert(NodeDouble head, int data) {
	    NodeDouble insert = new NodeDouble();
	    insert.data = data;

	    // List is empty
	    if (head == null) {
	        head = insert;
	    }
	    // Insert front
	    else if (data < head.data) {
	        insert.next = head;
	        head.prev = insert;
	        head = insert;
	    }
	    // Insert middle or end
	    else {
	        NodeDouble current = head;
	        // Iterate through list to find insertion point
	        while (current.next != null && current.data < data) {
	            current = current.next;
	        } // Stops at end of list or just after insertion point

	        // Insert before current
	        if (data < current.data) {
	            NodeDouble previous = current.prev;

	            // Create links to and from node before insertion point
	            previous.next = insert;
	            insert.prev = previous;
	            // Create links to and from node after insertion point
	            insert.next = current;
	            current.prev = insert;
	        }
	        // Insert after current at end of list
	        else {
	            current.next = insert;
	            insert.prev = current;
	        }
	    }

	    return head;
	}

}

class NodeDouble {
    int data;
    NodeDouble next;
    NodeDouble prev;
 }
