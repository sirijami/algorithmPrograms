
public class MaxSumPathBinaryTree {

	private static Node root;
	static int max_sum = Integer.MIN_VALUE;
	static int curr_sum = 0;
	static Node targetLeafNode = null;
	
    void  maxSumPath(Node node, int sum){
		if(node != null){
			sum = sum + node.data;
			if(sum > max_sum  && node.left == null && node.right == null ){
				max_sum = sum;
				targetLeafNode = node;
			}
			maxSumPath(node.left, sum);
			maxSumPath(node.right, sum);			
		}
	}

	private boolean path(Node node, Node LeafNode) {

		if(node == null){
			return false;
		}
		if(node == LeafNode || path(node.left, LeafNode) || path(node.right, LeafNode)){
			System.out.print(node.data + " ");
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		MaxSumPathBinaryTree t = new MaxSumPathBinaryTree();
		Node root = new Node(2);
		root.left = new Node(10);
		root.right = new Node(7);
		root.left.left = new Node(10);
		root.right.right = new Node(5);
		t.maxSumPath(root, 0);
		System.out.println("Max sum " + max_sum);
		t.path(root, targetLeafNode);
	}

}
