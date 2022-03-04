package com.banking;

import java.io.File;
import java.util.*;

//import org.json.simple.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Admin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ObjectMapper om = new ObjectMapper();
		Bank bank = om.readValue(new File("bank.json"),Bank.class);
		Scanner s = new Scanner(System.in);
		System.out.println("Hello Bank Administrator");
		System.out.println("**************************");
		for(int i=1;i<=5;) {
			System.out.println("Select the operation to perform");
			System.out.println("**************************");
			System.out.println(" 1.View All Customer Detail \n 2.Add New Customer \n 3.Issue New Debit Card "
					+ "\n 4.View Blocked Card \n 5.Block Debit Card ");
			int ch;
			ch = s.nextInt();
			switch (ch) {
			case 1:
				//View All Customer Detail
				for(Customers c: bank.getCustomers()) {
					System.out.println("**************************");
					System.out.println("Customer Details");
					System.out.println("**************************");
					System.out.println("Customer Id: "+c.getId());
					System.out.println("Customer Name: "+c.getName());
					for(Cards cds: c.getCards()) {
						System.out.println("**************************");
						System.out.println("Customer Card Details: ");
						System.out.println("**************************");
						System.out.println("Card Number : "+cds.getCardNum());
						System.out.println("Card Pin : "+cds.getPin());
						System.out.println("Card Balance : "+cds.getBalance());
						System.out.println("Card Status : "+cds.isActive());
					}
					System.out.println();
				}
				break;
			case 2:
				//Add new customer
				Customers cus = new Customers();
				System.out.println("Enter Id:");
				cus.setId(s.nextInt());
				System.out.println("Enter Name:");
				cus.setName(s.next());
				Cards nc = new Cards();
				nc.setCardNum(1234567);
				nc.setPin(0101);
				nc.setBalance(1000);
				nc.setActive(true);
				Cards nc1 = new Cards();
				cus.setCards(Arrays.asList(nc,nc1));
				Bank b = new Bank();
				b.setCustomers(Arrays.asList(cus));
				Bank cus1 = b;
				om.enable(SerializationFeature.INDENT_OUTPUT);
				om.writeValue(new File("bank1.json"), cus1);
				System.out.println("Customer Added Succesfully");
				break;
			case 3:
				//Case 3 Issue new Debit Card
				Customers cus2 = new Customers();
				Cards nc2 = new Cards();
				nc2.setCardNum(s.nextInt());
				nc2.setPin(s.nextInt());
				nc2.setBalance(s.nextInt());
				nc2.setActive(true);
				cus2.setCards(Arrays.asList(nc2));
				om.enable(SerializationFeature.INDENT_OUTPUT);
				om.writeValue(new File("card1.json"), cus2);
				System.out.println("Customer Added Succesfully");
				break;
			case 4:
				for(Customers c:bank.getCustomers()) {
					for(Cards cd:c.getCards()) {
						if(cd.isActive()==false) {
							System.out.println("**************************");
							System.out.println("Blocked Cards");
							System.out.println("**************************");
							System.out.println("Card Number : "+cd.getCardNum());
							System.out.println("Card Pin : "+cd.getPin());
							System.out.println("Card Balance : "+cd.getBalance());
						}
					}	
				}
				break;
			case 5:
				for(Customers c:bank.getCustomers()) {
					for(Cards cd:c.getCards()) {
						if(cd.isActive()==true) {
						}
					}
				}
				System.out.println("Case 5");
				break;
			default:
				System.out.println("!!!!Enter Valid Option!!!!");
				break;

			}
			System.out.println();
			i++;
		}
		s.close();
	}
}
