import java.util.Iterator;
import java.util.LinkedList;

public class Bai2 {
	public static void main(String[] args) {
		//khai bao va sinh lien ket
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		linkedList.add(5);
		linkedList.add(6);
		linkedList.add(7);
		
		System.out.println("List ban dau:");
		System.out.println(linkedList);
		//lay vi tri giua
		int index = linkedList.size()/2;
		linkedList.remove(index);
		System.out.println("List sau khi xoa:");
		System.out.println(linkedList);
	}
}
