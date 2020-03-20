
public class Bai8 {
	public static void main(String[] args) {
		int n = 8;
		int count = 0;
		for (int x = 0; x <= n; x++) {
			for (int y = 0; y <= n / 2; y++) {
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
