package code;

public class MaximumPathSum {

	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(10);
		tree.root.left = new Node(2);
		tree.root.right = new Node(10);
		tree.root.left.left = new Node(20);
		tree.root.left.right = new Node(1);
		tree.root.right.right = new Node(-25);
		tree.root.right.right.left = new Node(3);
		tree.root.right.right.right = new Node(4);
		System.out.println(maxPathSum(tree.root));
	}

	public static int maxPathSum(Node root) {
		int max[] = new int[1]; 
		max[0] = Integer.MIN_VALUE;
		calculateSum(root, max);
		return max[0];
	}

	public static int calculateSum(Node root, int[] max) {
		if (root == null)
			return 0;

		int left = calculateSum(root.left, max);
		int right = calculateSum(root.right, max);

		int current = Math.max(root.data, Math.max(root.data + left, root.data + right));

		max[0] = Math.max(max[0], Math.max(current, left + root.data + right));

		return current;
	}


}
