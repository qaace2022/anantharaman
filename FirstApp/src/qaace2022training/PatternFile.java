package qaace2022training;

import java.io.*;

public class PatternFile {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter fw = new FileWriter("/Users/anantharaman.ragupat/Documents/File IO example/pattern.txt");
			PrintWriter pw = new PrintWriter(fw);
			int i, j,n=4;
			for(i=0; i<n; i++)
			{
				for(j=0; j<=i; j++)
				{
					pw.print("* ");
				}
				pw.println();
			}
			System.out.println("File Created Successfully");
			pw.close();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}