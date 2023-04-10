package org.java;

import java.util.Scanner;

public class ArrayElementformUser {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array sizet");
		int size =sc.nextInt();
		System.out.println("Enter the array Element");
		int marks[]= new int[size];
		for(int i=0;i<size;i++)
		{
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(marks[i]);
		}
	}

	
}