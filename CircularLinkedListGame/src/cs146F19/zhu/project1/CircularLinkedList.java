package cs146F19.zhu.project1;

public class CircularLinkedList{ //Functions like a LinkedList, but automatically traverses to head
	                             //when trying to traverse from tail.
	private Node head; 
	private Node tail;
	
	public CircularLinkedList(){ //ctor
		head=null;
		tail=null;
	}
	
	public void append(int x){ //append an int
		append(new Node(x));
	}
	
	public void append(Node n){ //append a node
		if (tail == null) {
			n.prev=(null);
			n.next=(null);
			head = n;
			tail = n;
		}
		else {
			tail.next=(n);
			n.prev=(tail);
			tail = n;
		}
	}
	
	public void append(int[] arr){ //append a whole array of integer values
		for(int x=0; x<arr.length; x++){
			append(arr[x]);
		}
	}
	
	public int length(){ //iterate through CircularLinkedList, return number of nodes
		int counter = 0;
		Node n = head;
		while(n!=null){
			n=n.next;
			counter++;
		}
		return counter;		
	}
	
	public boolean isEmpty(){ //check if empty using length function
		if(length()==0){
			return true;
		}
		return false;
	}
	
	
	
	public void remove(Node n){ //remove specified node
		if(n==head){ //unique case: remove head
			head=head.next;
		}
		else if(n==tail){ //unique case: remove tail
			tail=tail.prev;
			tail.next=null;
		}
		else{ //vanilla case
			Node before = n.prev;
			Node after = n.next;
			before.next=after;
			after.prev=before;
		}
	}
	
	public void CircularLinkedListGame(int step){ //The game
		Node n=head;
		while(length()!=1){
			for(int x=0; x<step; x++){
				if(n.next==null){
					n=head;
				}
				else{
					n=n.next;
				}
			}

			remove(n);
			n=n.next; //since n is removed, go to the next element
			
			if(n==null){ //if that element is null, means it's the tail, so iterate to head
				n=head;
			}
			
		}
	}
	
	public String toString() { //Prints out all the prisoners currently in the circular linked list
		String s = "Prisoner Game: ";
		if (head == null)
			s += "Empty";
		else {
			Node n = head;
			while (n != null) {
				s += n.getData();
				n = n.getNext();
			}
		}
		return s;
	}

	public int getData(){ //used to check the prisoner left after game is done 
		if(length()==1) //make sure game is done or it is executed correctly
			return head.getData();
		return -1;
	}

}
