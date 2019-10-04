package cs146F19.zhu.project1;

import java.io.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		//ElementShuffler class execution
		ElementShuffler e = new ElementShuffler();
		File f = new File("data/ErdosCA.txt");
		ArrayList<String> list = new ArrayList<String>(e.copyToList(f));
		String[] copiedArr = e.listToArray(list);
		String[] shuffledArr = e.shuffle(copiedArr);
		e.arrayToTxt(shuffledArr); //Find the output file under data folder: "ZhuJustinShuffled.txt"
//		System.out.println(System.currentTimeMillis());
		
	

	}
}
