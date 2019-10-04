package cs146F19.zhu.project1;

import java.util.*;
import java.io.*;

public class ElementShuffler { //Takes in a file, shuffles it, outputs a new file
	Random r = new Random();

	public ArrayList<String> copyToList(File f) throws Exception { //Copy the data in txt file to an ArrayList
		ArrayList<String> dataArray = new ArrayList<String>();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String s;
		br.readLine(); //first line not needed
		while ((s = br.readLine()) != null) {
			dataArray.add(s);
		}
		fr.close();
		br.close();
		return dataArray;
	}

	public String[] listToArray(ArrayList<String> list) { //Convert the ArrayList to a String[]
		if (list.size() == 0) {
			return null;
		}
		else{
			String[] array = new String[list.size()];
			for (int x = 0; x < array.length; x++) {
				array[x] = list.get(x);
			}
	
			return array;
		}
	}

	public String[] shuffle(String[] arr) { //Shuffle the String[]
		String temp;
		r.setSeed(20); //seed to 20 to match target2.txt
		for (int i = arr.length - 1; i > 0; i--) {
			int j = r.nextInt(i);
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		return arr;
	}

	public void arrayToTxt(String[] arr) { //Copy each line of the String[] to a txt file
		try {
			FileWriter fw = new FileWriter("data/ZhuJustinShuffled.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			for (int x = 0; x < arr.length; x++) {
				bw.write(arr[x]);
				bw.newLine();
			}

			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("Fail arrayToTxt");
		}

	}

}