package Bai11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		int a,b;
		File file = new File("D:\\eclipse\\workspace\\Qualification-test\\src\\Bai11\\test.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
		while (scan.hasNextLine()) {
			a = scan.nextInt();
			b = scan.nextInt();
			for (int i = a; i <= b; i++) {
				if (dic.get(i) != null)
					dic.put(i, dic.get(i) + 1);
				else
					dic.put(i, 1);
			}
		}
		System.out.println(Collections.max(dic.entrySet(), Comparator.comparingInt(Map.Entry::getValue)).getKey());
	}
}
