package code;

public class CheckIfBST {

	public static void main(String[] args) {
		
	}
	
	public static boolean isBalanced(BstNode<Integer> root){
		
		return isbalance(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean isbalance(BstNode<Integer> root,int min,int max){
		if(root==null)
			return true;
		
		if(root.data>min && root.data<max && isbalance(root.left, min, root.data)
				&& isbalance(root.right, root.data, max)){
			return true;
		}
		else 
			return false;
		
	}

}
