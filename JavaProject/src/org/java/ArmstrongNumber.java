package org.java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int n=num;
		int cubesum=0;
		//logic
		while(n>0)
		{
			int rem=n%10;
			cubesum=cubesum+(rem*rem*rem);
			n=n/10;
		}
		if(num==cubesum)
		{
			System.out.println(num+"is an amrong strong number");
		}
		else
		{
			System.out.println(num+"is not an armstrong number");
		}
	}

}
