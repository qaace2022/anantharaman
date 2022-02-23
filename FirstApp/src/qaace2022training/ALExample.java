package qaace2022training;

import java.util.*;
public class ALExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Name= new ArrayList<String>();
		ArrayList<String> letters = new ArrayList<>();
		letters.add("A");
		letters.add("R");
		letters.add("P");
		System.out.println(Name.isEmpty());
		Name.add("Francis");
		Name.add("Bell");
		Name.add("Ajay");
		Name.add("Gang");
		Name.add("Leader");
		System.out.println(Name);
		System.out.println(Name.size());
		System.out.println (letters.addAll(Name));
		System.out.println(Name.get(2));
		Name.set(3, "BTS");
		System.out.println(Name);
		Name.remove(3);
		System.out.println(Name);
		Iterator<String> itr=Name.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(Name);
		for(String list:Name)    
			System.out.println(list);
		Collections.reverse(Name);
		System.out.println(Name);
		Collections.sort(Name);
		System.out.println(Name);
	}
}
