package org.java;
import java.util.Scanner;
public class BankDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b;
		boolean exit=true;
		while(exit)
		{
			System.out.println("Welcome to bank");
			System.out.println("Enter choice:\n1.Create Account:"
					+ "\n2.Deposite Amount:\n3.Withdraw Amount:"
					+ "\n4.Check Blance:\n5.Account Details:\n6.Exit");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				Bank.createAccount();
			}
			break;
			case 2:
			{
				Bank.deposite();
			}
			break;
			case 3:
			{
				Bank.withdraw();
			}
			break;
			case 4:
			{
				Bank.checkblance();
			}
			break;
			case 5:
			{
				Bank.printdetails();
			}
			break;
			case 6:
			{
				exit=false;
			}
			
			}	

		}
	}
}


