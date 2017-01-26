package code;

import java.util.LinkedList;
import java.util.List;


public class PathSumBinaryTree {
	public List<List<Integer>> pathSum(BstNode<Integer> root, int sum){
		List<List<Integer>> result  = new LinkedList<List<Integer>>();
		List<Integer> currentResult  = new LinkedList<Integer>();
		pathSum(root,sum,currentResult,result);
		return result;
	}

	//Checks if it has path
	public static boolean hasPath(BstNode<Integer> root, int sum){
		if(root==null){
			return false;
		}
		if(root.data==sum && root.left==null && root.right==null){
			return true;
		}

		return hasPath(root.left,sum-root.data) || hasPath(root.right, sum-root.data);
	}

	public void pathSum(BstNode<Integer> root, int sum, List<Integer> currentResult,
			List<List<Integer>> result) {

		if (root == null)
			return;
		currentResult.add(new Integer(root.data));
		if (root.left == null && root.right == null && sum == root.data) {
			result.add(new LinkedList(currentResult));
			currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
			return;
		} else {
			if(root.left!=null)
				pathSum(root.left, sum - root.data, currentResult, result);
			if(root.right!=null)
				pathSum(root.right, sum - root.data, currentResult, result);
		}
		currentResult.remove(currentResult.size() - 1);
	}
}
