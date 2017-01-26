package code;


public class SameTree {

	public static void main(String[] args) {

	}

	public static boolean sameTree(BstNode p,BstNode q){
		if(p==null && q==null){
			return p==q;
		}
		if(p.data!=q.data){
			return false;
		}
		return(sameTree(p.left,q.left) && sameTree(p.right,q.right));
	}
	
	
	
	
}
