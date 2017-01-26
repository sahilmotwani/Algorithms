package code;

public class CheckIfBSTBalanced {
	
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
        tree.root.left.left.left = new Node(9);
        tree.root.left.left.left = new Node(10);
        tree.root.left.left.left = new Node(11);
        tree.root.left.left.left = new Node(12);
		System.out.println(checkIfBalanced(tree.root));
	}
	
	
	public static boolean checkIfBalanced(Node root){
		if(checkBalance(root)==-1){
			return false;
		}
		return true;
	}
	
	public static int checkBalance(Node root){
		if(root==null){
			return 0;
		}
		int leftHeight=checkBalance(root.left);
		if(leftHeight==-1){
			return -1;
		}
		
		int rightHeight=checkBalance(root.right);
		if(rightHeight==-1){
			return -1;
		}
		
		if(Math.abs(leftHeight-rightHeight)>1){
			return -1;
		}
		return 1+ Math.max(leftHeight, rightHeight);
		
		
	}
}

class Node {
	 
    int data;
    Node left, right;
 
    Node(int d) {
        data = d;
        left = right = null;
    }
}

class BinaryTree {
	 
    Node root;
 
 
}
 
