package lab.ex09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Datensuche {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/Users/levipellegrino/Desktop/mr-small.csv");
		Scanner s = new Scanner(file);
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()) {
			list.add(s.nextLine());
		}
		s.close();
		System.out.println(list.get(0));
	}
}