import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class TreeTraversal {
	Node root;

	public static void main(String[] args) {
		TreeTraversal t = new TreeTraversal();
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		t.root.left.left.left = new Node(6);
		t.root.left.left.right = new Node(7);
		System.out.println("Printing level order traversal");
		t.printlevelOrderTraversal();
		System.out.println();
		System.out.println("Printing reverse level order traversal");
		t.reverseLevelOrederTraversal();
	}
	
	void printlevelOrderTraversal(){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp_node = queue.poll();
			System.out.print(temp_node.data + " ");
			
			if(temp_node.left != null){
				queue.add(temp_node.left);
			}
			if(temp_node.right != null){
				queue.add(temp_node.right);
			}						
		}		
	}
	
	void reverseLevelOrederTraversal(){
		Queue<Node> queue = new LinkedList<Node>();
		Stack<Node> stack = new Stack<Node>();
		
		queue.add(root);
		while(!queue.isEmpty()){
			Node temp_node = queue.poll();
			stack.push(temp_node);
			
			if(temp_node.right != null){
				queue.add(temp_node.right);
			}
			
			if(temp_node.left != null){
				queue.add(temp_node.left);
			}
		}
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop().data + " ");
		}
	}

}
