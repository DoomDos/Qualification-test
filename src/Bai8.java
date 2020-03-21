
public class Bai8 {
	public static void main(String[] args) {
		int n = 8;
		int count = 0;
		//giai phuong trinh x + 2y + 5z = n
		//moi lan nghiem của x, y, z thoa man se la mot cach
		//x <= n
		for (int x = 0; x <= n; x++) {
			//y <= n/2
			for (int y = 0; y <= n / 2; y++) {
				//z <= n/5
				for (int z = 0; z <= n / 5; z++) {
					if ((x + 2 * y + 5 * z) == n) {
						count++;
					}

				}
			}
		}
		System.out.println(count);
	}
}
