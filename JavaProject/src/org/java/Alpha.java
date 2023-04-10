package org.java;
public class Alpha extends MethodOverloading{
	String colour;
	int num;
	double money;
	Alpha(String colour,int num,double money,String name,int pwd,double price)
	{
		super(name,pwd,price);
		this.colour=colour;
		this.num=num;
		this.money=money;
	}
	public void m3()
	{
		System.out.println(colour);
		System.out.println(num);
		System.out.println(money);
		System.out.println(name);
		System.out.println(pwd);
		System.out.println(price);
	}
	public static void main(String[]args)
	{
		Alpha a=new Alpha("white",458,54.15,"Biswajit",123,45.34);
		a.m3();
	}
}
