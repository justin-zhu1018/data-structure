package cs146F19.zhu.project1;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class ElementShufflerTest { 
	ElementShuffler program;
	BufferedReader in;
	BufferedReader out;
	BufferedReader target;
	String expectedLine;
	File f;
	String[] unshuffledArr;
	ArrayList<String> strList;
	String[] shuffledArr;
	
	@Before
	public void setUp(){
		program = new ElementShuffler();
		f= new File("data/ErdosCA.txt");
		strList = new ArrayList<String>();
	}
	
	@Test
	public void test() { //compare my shuffled txt file to the target txt file
		try{	
			strList=program.copyToList(f); //copies elements of ErdosCA into a list
			unshuffledArr=program.listToArray(strList); //copies list elements into a string[]
			shuffledArr=program.shuffle(unshuffledArr); //shuffles string[] of elements in ErdosCA
			program.arrayToTxt(shuffledArr);  //creates output file from array
			in = new BufferedReader(new FileReader("data/ErdosCA.txt"));
			out = new BufferedReader(new FileReader("data/ZhuJustinShuffled.txt"));
			target = new BufferedReader(new FileReader("data/Target2.txt"));
			while((expectedLine = target.readLine()) != null){
				String actualLine = out.readLine();
				assertEquals(expectedLine, actualLine);
			}
					
		}
		catch(Exception e){
			System.out.println("There was an error.");
		}
	}
	


}
