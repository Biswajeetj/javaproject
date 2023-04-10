package org.java;

import java.util.Scanner;

public class Bank {
	static String name;
	static double money;
	static double deposite;
	static double withdraamount;
	static int pwd;

	public static  void createAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Accountname");
		name=sc.nextLine();
		System.out.println("Enter the money");
		money=sc.nextInt();
		System.out.println("Enter the pwd");
		pwd=sc.nextInt();
		System.out.println("Account sucessfully created");
	}
	public static void deposite()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the depositeamount");
		deposite=sc.nextDouble();
		money=money+deposite;
		System.out.println("Suseccefully deposited"+deposite+"Rs");

	}
	public static void withdraw()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the withdrawamount");
		withdraamount=sc.nextInt();
		money=money-withdraamount;
		System.out.println("sucessfully withdrawn"+withdraamount+"Rs");
	}
	public static void checkblance()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Available blane is "+money+"Rs");
	}
	public static void printdetails()
	{
		System.out.println("Account name:"+name);
		System.out.println("Account password:"+pwd);
	}
}
