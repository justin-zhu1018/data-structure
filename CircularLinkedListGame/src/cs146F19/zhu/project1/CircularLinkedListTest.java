package cs146F19.zhu.project1;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

public class CircularLinkedListTest{  //JUnit Test Class for Part B; Prisoner Game
	CircularLinkedList prisoners;
	CircularLinkedList tc1, tc2, tc3, tc4, tc5;
	int key1, key2, key3, key4, key5;
	@Before
	public void setUp(){ //Make a prisoner CLL's to test and get all the test cases ready
		prisoners = new CircularLinkedList();
		tc1 = new CircularLinkedList();
		tc2 = new CircularLinkedList();
		tc3 = new CircularLinkedList();
		tc4 = new CircularLinkedList();
		tc5 = new CircularLinkedList();

		int[] a1 = {1,2,3,4,5,6};
		tc1.append(a1);
		key1 = 2;
		
		int[] a2 = {1};
		tc2.append(a2);
		key2 = 9;
		
		int[] a3 = {1,2,3,4,5,6,7};
		tc3.append(a3);
		key3 = 7;
		
		int[] a4 = {1,2,3,4,5,6,7,8,9,10,11,12};
		tc4.append(a4);
		key4 = 8;
		
		int[] a5 = {1,2,3,4,5};
		tc5.append(a5);
		key5 = 1;
	}
	@Test
	public void testList() { //Test to make sure that CLL is working properly
		assertTrue(prisoners.isEmpty());
		assertEquals(0,prisoners.length());
		prisoners.append(5);
		assertFalse(prisoners.isEmpty());
		assertEquals(1, prisoners.length());
	}
	
	@Test
	public void testCases() { //All the different test cases
		tc1.CircularLinkedListGame(key1);
		assertEquals(1, tc1.getData());  //getData returns -1 if length of list > 1
		
		tc2.CircularLinkedListGame(key2);
		assertEquals(1, tc2.getData());
		
		tc3.CircularLinkedListGame(key3);
		assertEquals(4, tc3.getData());
		
		tc4.CircularLinkedListGame(key4);
		assertEquals(2, tc4.getData());
		
		tc5.CircularLinkedListGame(key5);
		assertEquals(3, tc5.getData());
	}

}
