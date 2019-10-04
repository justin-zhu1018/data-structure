package cs146F19.zhu.project1;

public class Main {
	public static void main(String[] args){
		//CircularLinkedList class execution
		CircularLinkedList tc1 = new CircularLinkedList();
		CircularLinkedList tc2 = new CircularLinkedList();
		CircularLinkedList tc3 = new CircularLinkedList();
		CircularLinkedList tc4 = new CircularLinkedList();
		CircularLinkedList tc5 = new CircularLinkedList();

		int[] a1 = {1,2,3,4,5,6};
		tc1.append(a1);
		int key1 = 2;
		tc1.CircularLinkedListGame(key1);
		System.out.println("Test Case 1 output: " + tc1.getData());
		
		int[] a2 = {1};
		tc2.append(a2);
		int key2 = 9;
		tc2.CircularLinkedListGame(key2);
		System.out.println("Test Case 2 output: " + tc2.getData());

		int[] a3 = {1,2,3,4,5,6,7};
		tc3.append(a3);
		int key3 = 7;
		tc3.CircularLinkedListGame(key3);
		System.out.println("Test Case 3 output: " + tc3.getData());

		int[] a4 = {1,2,3,4,5,6,7,8,9,10,11,12};
		tc4.append(a4);
		int key4 = 8;
		tc4.CircularLinkedListGame(key4);
		System.out.println("Test Case 4 output: " + tc4.getData());

		int[] a5 = {1,2,3,4,5};
		tc5.append(a5);
		int key5 = 1;
		tc5.CircularLinkedListGame(key5);
		System.out.println("Test Case 5 output: " + tc5.getData());


	}
}
