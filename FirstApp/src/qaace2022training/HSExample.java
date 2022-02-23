package qaace2022training;

import java.util.*;
public class HSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> Name=new HashSet<String>();
		System.out.println("Is the set empty: "+Name.isEmpty());
		Name.add("Francis");
		Name.add("Kubera");
		Name.add("Thanushree");
		Name.add("Pavithra");
		Name.add("Anantharaman");
		Name.add("Francis");
		Name.add("Kubera");
		Name.add(null);
		System.out.println(Name);
		System.out.println(Name.contains("Francis"));
		System.out.println("The size is: " + Name.size());
		for(String list:Name)    
			System.out.println(list);
	}
}
