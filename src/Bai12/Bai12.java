package Bai12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		File file = new File("D:\\eclipse\\workspace\\Qualification-test\\src\\Bai12\\dic.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<String, Integer> dic = new HashMap<String, Integer>();
		dic.put(" ", 1);
		while (scan.hasNextLine()) {
			dic.put(scan.next(), scan.nextInt());
		}
		File file2 = new File("D:\\eclipse\\workspace\\Qualification-test\\src\\Bai12\\test.txt");
		try {
			scan = new Scanner(file2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scan.hasNextLine()) {
			String str = scan.nextLine();
			System.out.println(str + ":");
			for (int i = 0; i < str.length(); i++) {
				System.out.print(dic.get(String.valueOf(str.charAt(i))));
			}
			System.out.println();
		}

	}
}