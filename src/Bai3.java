import java.util.EmptyStackException;

public class Bai3 {
	public static void main(String[] args) {
		Stack arr = new Stack(5);
		arr.push(1);
		arr.push(2);
		arr.push(3);
		if (!arr.isEmpty())
			System.out.println("Phan tu top: " + arr.peek());
		arr.pop();
		if (!arr.isEmpty())
			System.out.println("Phan tu top: " + arr.peek());
		arr.push(4);
		arr.push(5);
		arr.push(6);
		arr.push(7);
		if (!arr.isEmpty())
			System.out.println("Phan tu top: " + arr.peek());
		arr.sort();
	}
}

class Stack {
	private int arr[];
	private int size;
	private int index = -1;

	public Stack(int size) {
		this.size = size;
		arr = new int[size];
	}

	public boolean isEmpty() {
		if (index == -1) {
			return true;
		}
		return false;
	}

	public void pop() {

		if (isEmpty()) {
			System.out.println("Ngan xep rong");
		}
		arr[index] = 0;
		index--;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Ngan xep rong");
			return -1;
		}
		return arr[index];
	}

	public void push(int a) {
		if (isFull()) {
			System.out.println("Ngan xep da day");
			return;
		} else {
			index++;
			arr[index] = a;
		}
	}

	public boolean isFull() {
		if (index >= size - 1) {
			return true;
		}
		return false;
	}

	public void sort() {
		int count = index;
		int tmp[] = new int[index + 1];
		if (isEmpty()) {
			System.out.println("Ngan xep rong");
			return;
		}
		for (int i = 0; i <= count; i++) {
			tmp[i] = peek();
			pop();
		}
		InsertSort(tmp, tmp.length);
		for (int i = 0; i < tmp.length; i++) {
			push(tmp[i]);
			//in ra man hinh tu day ngan xep toi dinh
			System.out.print(peek() + " ");
		}
		System.out.println();
	}

	void InsertSort(int a[], int n) {
		int tmp, j;
		for (int i = 1; i < n; i++) {
			j = i - 1;
			tmp = a[i];
			while (j >= 0 && tmp > a[j]) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = tmp; // Chèn
		}
	}
}
