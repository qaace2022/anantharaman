package qaace2022training;

import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
        int roll, math, phy, chem, bio;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Name: ");
        Name=s.nextLine();
        System.out.print("Enter Roll Number : ");
        roll=s.nextInt();
        System.out.print("Enter mark in Maths : ");
        math=s.nextInt();
        System.out.print("Enter mark in Physics : ");
        phy=s.nextInt();
        System.out.print("Enter mark in Chemistry : ");
        chem=s.nextInt();
        System.out.print("Enter mark in Biology : ");
        bio=s.nextInt();
        int total=math+phy+chem+bio;
        float perc=(float)total/400*100;
        System.out.println("Roll Number:" + roll +"\tName: "+Name);
        System.out.println("Marks (Maths, Physics, Chemistry, Biology): "+math+","+phy+","+chem+","+bio);
        System.out.println("Total: "+total +"\tPercentage: "+perc);
        s.close();
	}

}
