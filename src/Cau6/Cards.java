package Cau6;

public class Cards {
	String number;
	String color;
	String numberCheck[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
	String colorCheck[] = { "clubs", "diamonds", "hearts", "spades" };

	public Cards() {
	}

	public Cards(String number, String color) {
		int check;
		check = 0;
		for (int i = 0; i < numberCheck.length; i++) {
			if (number == numberCheck[i]) {
				this.number = number;
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("Wrong number or color!");
			return;
		}
		check = 0;
		for (int i = 0; i < colorCheck.length; i++) {
			if (color == colorCheck[i]) {
				this.color = color;
				check = 1;
				break;
			}
		}
		if (check == 0) {
			System.out.println("Wrong number or color!");
		}
		return;

	}

	public String toString() {
		if (number != null && color != null)
			return number + " of " + color;
		else
			return null;
	}
}
