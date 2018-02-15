package Assignment3;

/* Write a function to replace every element with it's next greatest element in a Single linked list */
class Node{
	int val;
	Node next;
	
	Node(int i){
		this.val = i;
		next = null;		
	}
}

public class ReplaceWithNextGreatestElement {
	Node head;

	public static void main(String[] args) {
		ReplaceWithNextGreatestElement list = new ReplaceWithNextGreatestElement();
		list.head = new Node(3);
		Node second = new Node(5);
		Node third = new Node(15);
		Node fourth = new Node(10);
		Node fifth = new Node(7);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		System.out.println("Original list");
		list.printlist();	/* 3 -> 5 -> -3 -> 15 -> 7 -> null */
		list.findNextGreatestElement();
		System.out.println("After replacing ");
		list.printlist();
	}


	private void printlist() {
		if(head == null){
			return;
		}
		Node p = head;
		while(p.next != null){
			System.out.print(p.val + " " + " -> ");
			p = p.next;
		}
		System.out.print(p.val + " -> null ");
		System.out.println();		
	}
	
	public int listLength(){
		int length = 0;
		Node p = head;
		while(p != null){
			length++;
			p = p.next;			
		}
		return length;
	}
	
	public void findNextGreatestElement(){
		Node curr_node = head;
		Node next_node = head.next;
		int  length = listLength();
//		System.out.println("the length of list " + length);
		int maxElement = next_node.val;
		
		for(int i = 0; i < length-2; i++ ){
			for(int j = i + 1 ; j < length -1; j++){
				if( next_node.next.val > maxElement){
					maxElement = next_node.next.val;
				}else {
					next_node = next_node.next;
				}				
			}
			curr_node.val = maxElement;
			curr_node = curr_node.next;
			next_node = curr_node.next;
			maxElement = next_node.val;
		}
		curr_node.val = maxElement;
		next_node.val = -1;		
	}

}


