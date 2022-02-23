package qaace2022training;

import java.util.*;
public class HMExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> Name=new HashMap<Integer,String>();
		Name.put(1,"Francis");
		Name.put(2,"Kubera");
		Name.put(3,"Thanushree");
		Name.put(4,"Pavithra");
		Name.put(5,"Anantharaman");
		Name.put(3,"Thanushree");
		System.out.println(Name);
		System.out.println(Name.isEmpty());
		System.out.println(Name.containsKey(3));
		System.out.println(Name.containsValue("Pavithra"));
		for(Map.Entry<Integer,String> m : Name.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());   
		}
		System.out.println("Size of HashMap "+Name.size());
	}
}
