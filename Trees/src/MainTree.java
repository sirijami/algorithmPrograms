//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Queue;
//
//class BTNode
//{
//	int key;
//	BTNode left, right;
//	public BTNode(int key)
//	{
//		this.key = key;
//		left = right = null;
//	}
//}
//
//class QItem
//{
//	BTNode node;
//    int hd;
//    public QItem(BTNode n, int h){
//    	node = n;
//		hd = h;
//	}
//}
//
//class BTree
//{
//	BTNode root;
//
//	public BTree() { root = null; }
//	public BTree(BTNode n) { root = n; }
//
//	public void printTopView()
//	{
//		if (root == null) { return; }
//
//		HashSet<Integer> set = new HashSet<Integer>();
//
//		Queue<QItem> Q = new LinkedList<QItem>();
//		Q.add(new QItem(root, 0)); 
//
//		while (!Q.isEmpty())
//		{
//			QItem qi = Q.poll();
//			int hd = qi.hd;
//			BTNode n = qi.node;
//
//			if (!set.contains(hd))
//			{
//				set.add(hd);
//				System.out.print(n.key + " ");
//			}
//
//			if (n.left != null)
//				Q.add(new QItem(n.left, hd-1));
//			if (n.right != null)
//				Q.add(new QItem(n.right, hd+1));
//		}
//	}
//}
//
//public class MainTree
//{
//	public static void main(String[] args)
//	{
//
//		BTNode root = new BTNode(1);
//		root.left = new BTNode(2);
//		root.right = new BTNode(3);
//		root.left.right = new BTNode(4);
//		root.left.right.right = new BTNode(5);
//		root.left.right.right.right = new BTNode(6);
//		BTree t = new BTree(root);
//		t.printTopView();
//	}
//}