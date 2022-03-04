package com.banking;

import java.io.File;
import java.util.*;
import com.fasterxml.jackson.databind.ObjectMapper;
public class Customer {
	int balance=100;
	void withdrawn(String name, int withdrawal)
	{
		if (balance >= withdrawal) {
			System.out.println(name + " withdrawn "
					+ withdrawal);

			balance = balance - withdrawal;
			System.out.println("Balance after withdrawal: "+ balance);
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		Bank bank = om.readValue(new File("bank.json"),Bank.class);
		Scanner s = new Scanner(System.in);
		System.out.println("Hello Customer");
		System.out.println("**************************");
		System.out.println("Select the operation to perform");
		System.out.println("**************************");
		System.out.println(" 1.View Balance \n 2.Deposit \n 3.Withdraw \n 4.Block Debit Card ");
		int ch;
		ch = s.nextInt();
		switch (ch) {
		case 1:
			//View Balance
			for(Customers cts:bank.getCustomers()) {
				int id1,id2;
				String cn1,cn2;
				id1=cts.getId();
				cn1=cts.getName();
				System.out.println("Enter Id :");
				id2=s.nextInt();
				System.out.println("Enter Name");
				cn2=s.next();
				if(id1==id2 && cn1.contentEquals(cn2)){
					for(Cards cds1:cts.getCards()) {
						int c1,p1,c2,p2;
						c1=cds1.getCardNum();
						p1=cds1.getPin();
						System.out.println("Enter Card Number");
						c2=s.nextInt();
						System.out.println("Enter Pin");
						p2=s.nextInt();
						if(c1==c2 && p1==p2) {
							System.out.println("**************************");
							System.out.println("Current Balance : "+cds1.getBalance());
							System.out.println("**************************");
						}
						else {
							System.out.println("!!!!Enter valid details!!!!");
						}
						break;
					}
				}
				else {
					System.out.println("!!!Enter Valid Detail!!!");
				}
				break;
			}
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		}
		s.close();
	}
}
