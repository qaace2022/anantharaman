package qaace2022training;

import java.util.*;
public class MultiValues {

	public static List<Object> getDetails()
	{
		int EmpId=1627;
		String name = "Anantharaman";
		int age = 23;
		char gender = 'M';

		return Arrays.asList(EmpId, name, age, gender);
	}
	public static void main(String[] args)
	{
		List<Object> person = getDetails();
		System.out.println(person);
	}
}