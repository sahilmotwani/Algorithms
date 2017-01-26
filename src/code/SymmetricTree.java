package code;

public class SymmetricTree {

	public static void main(String[] args) {
		
	}

	public static boolean isSymmetric(BstNode root){
		if(root==null)
			return true;
		return checkTree(root.left,root.right);
	}
	public static boolean checkTree(BstNode left, BstNode right){
		if(left==null || right==null){
			return left==right;
		}
		if(left.data!=right.data){
			return false;
		}
		return checkTree(left.left,right.right) && checkTree(left.right,right.right);
	}

}
