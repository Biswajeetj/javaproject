package org.java;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	/*public static void main(String[] args) {
	// How to create A file And check the details of file
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path where u store the file");
		String file = sc.nextLine();
		System.out.println("Enter the second file");
		String file2=sc.nextLine();
		File f=new File(file);
		File f2=new File(file2);
		try
		{
			f.createNewFile();
			f2.createNewFile();
			System.out.println("Sucessfully:"+f.getName());
			System.out.println("Sucessfully:"+f2.getName());
			System.out.println("press y to get the details");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y')
			{
				System.out.println("First File Name:"+f.getName());
				System.out.println("First File Name:"+f2.getName());
				System.out.println("Size of:"+f.getName()+""+f.length());
				System.out.println("Size of:"+f2.getName()+""+f2.length());

				System.out.println("Path of "+f.getName()+"is:"+f.getAbsolutePath());
				System.out.println("Path of "+f2.getName()+"is:"+f2.getAbsolutePath());

				System.out.println(f.getName()+"Read Access :"+f.canRead());
				System.out.println(f2.getName()+"Read Access :"+f2.canRead());

				System.out.println(f.getName()+"Write Access :"+f.canWrite());
				System.out.println(f2.getName()+"Write Access :"+f2.canWrite());	
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}*/
	//How to write ina file
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc.nextLine();
		// creating a new file
		File f=new File(path);
		try {
			f.createNewFile();// new file created
			System.out.println(f.getName()+"Sucessfully created");
			// write data into file
			FileWriter writer=new FileWriter(f.getAbsolutePath());
			// taking data from user to write in file
			System.out.println("enter the data");
			String data =sc.nextLine();
			// writes data into file
			writer.write(data);
			writer.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}*/
	// how to read the data
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ");
		
	}
}







































