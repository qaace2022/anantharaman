package com.banking;

import java.io.File;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
public class BankMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		Bank bank = om.readValue(new File("bank.json"),Bank.class);
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to XYZ Bank");
		System.out.println("**************************");
		System.out.println("Select The User Type");
		System.out.println("**************************");
		System.out.println("1.Bank Administrator");
		System.out.println("2.Customer");
		System.out.println("**************************");
		int ch;
		ch = s.nextInt();
		switch (ch) {
		case 1:
			String un,pwd;
			String un1=bank.getAdmin().username;
			String pwd1=bank.getAdmin().password;
			System.out.println("Enter Username:");
			un = s.next();
			System.out.println("Enter Password:");
			pwd = s.next();
			if(un.contentEquals(un1) && pwd.contentEquals(pwd1)) {
			Admin.main(args);
			}
			else {
				System.out.println("Enter Valid Credentials");
			}
			break;
		case 2:
			Customer.main(args);
			break;
		default:
			System.out.println("Enter Valid Option!");
			break;
		}
		s.close();
	}
}
