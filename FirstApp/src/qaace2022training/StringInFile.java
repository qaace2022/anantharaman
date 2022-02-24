package qaace2022training;

import java.util.*;
import java.io.*;
public class StringInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The String Wants To Store In File : ");
		str = s.nextLine();
		byte[] byte1 = str.getBytes();
		try {
			FileOutputStream file = new FileOutputStream("/Users/anantharaman.ragupat/Documents/File IO example/out.txt");
			file.write(byte1);
			System.out.println("Created Succesfully");
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}
}