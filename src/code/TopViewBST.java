package code;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

//Has one additional method. Use top_view method 

public class TopViewBST {

	public static void main(String[] args) {

        /* Create following Binary Tree
             1
           /  \
          2    3
           \
            4
             \
              5
               \
                6*/
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        Tree t = new Tree(root);
        System.out.println("Following are nodes in top view of Binary Tree");
        top_view(root);
    
	}
	
	
	static void getLeftRoot(Node root){
		if(root.left!=null){
			getLeftRoot(root.left);
		}
		System.out.print(root.data+" ");
	}
	    
	 static void top_view(Node root)
	{
		 if(root==null){
			 return;
		 }
		 if(root.left!=null){
		 getLeftRoot(root.left);
		 }
		 System.out.print(root.data+" ");
		 if(root.right!=null){
		 getRightRoot(root.right);
		 }
	}
	 
		static void getRightRoot(Node root){
			if(root.right!=null){
				getRightRoot(root.right);
			}
			System.out.print(root.data+" ");
		}

		
		
		
		
		//Additional method
		public static void printTopView(Node root)
	    {
	        // base case
	        if (root == null) {  return;  }
	 
	        // Creates an empty hashset
	        HashSet<Integer> set = new HashSet<>();

	        Map<Node,Integer> keyVal=new LinkedHashMap<>();
	        keyVal.put(root, 0);
	        // Create a queue and add root to it
	        Queue<Node> Q = new LinkedList<Node>();
	        Q.add(root); // Horizontal distance of root is 0
	 
	        // Standard BFS or level order traversal loop
	        while (!Q.isEmpty())
	        {
	            // Remove the front item and get its details
	            Node qi = Q.remove();
	            int hd = keyVal.get(qi);
	 
	            // If this is the first node at its horizontal distance,
	            // then this node is in top view
	            if (!set.contains(hd))
	            {
	                set.add(hd);
	                System.out.print(qi.data + " ");
	            }
	 
	            // Enqueue left and right children of current node
	            if (qi.left != null){
	                Q.add(qi.left);
	                keyVal.put(qi.left,hd-1);
	            }
	            if (qi.right != null){
	                Q.add(qi.right);
	                keyVal.put(qi.right, hd+1);
	            }
	        }
	    }
	 
	 
}
class Tree
{
    Node root;
 
    // Constructors
    public Tree()  { root = null; }
    public Tree(Node n) { root = n; 
    }
    }
  

    
