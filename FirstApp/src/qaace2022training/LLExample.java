package qaace2022training;

import java.util.*;

public class LLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> Name = new LinkedList<String>();
		Name.add("Kubera");
		Name.add("Varman");
		Name.add(null);
		Name.addLast("Thanushree");
		Name.addFirst("Francis");
		Name.add(2, "Anantharaman");
		System.out.println(Name);
		System.out.println("Element at index 3 is : " + Name.get(3));
		Name.set(1, "Pavithra");
		System.out.println(Name);
		for (String list : Name)
			System.out.print(list + " ");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name);
		Name.removeFirst();
		System.out.println(Name);
		Name.removeLast();
		System.out.println(Name);
	}
}
