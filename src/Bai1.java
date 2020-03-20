import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Random random = new Random();
		int n;
		File file = new File("D:\\eclipse\\workspace\\Qualification-test\\src\\test1.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (scan.hasNext()) {
			n = scan.nextInt();
			int a[][] = new int[n][n];
			// sinh ma tran goc
			System.out.println("Ma tran goc:");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = random.nextInt(100);
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Ma tran xoay");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					System.out.print(rotate(a)[i][j] + " ");
				}
				System.out.println();
			}
		}

	}

	// ham rotate
	static int[][] rotate(int a[][]) {
		// khai bao mang temp va bien dem
		int tmp[][] = new int[a.length][a.length];
		int index;
		for (int i = 0; i < tmp.length; i++) {
			// gan gia tri bien dem
			index = a.length - 1;
			// xoay 90 thi cot va hang chay trai chieu
			for (int j = 0; j < tmp.length; j++) {
				tmp[i][j] = a[index][i];
				index--;
			}
		}
		// tra ve ma tran da xoay
		return tmp;
	}
}
