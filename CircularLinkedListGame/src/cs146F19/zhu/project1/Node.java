package cs146F19.zhu.project1;

public class Node { //Node class used for circular linked list
	private int data;
	Node next;
	Node prev;
	
	public Node(int data){
		this.data=data;
	}
	
	public int getData(){
		return data;
	}
	
	public void setData(int data){
		this.data=data;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public Node getPrev(){
		return this.prev;
	}
	
	
	
}
