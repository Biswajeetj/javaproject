package org.java;

public class MethodOverloading 
{
	String name;
	int pwd;
	double price;
	MethodOverloading(String name)
	{
	this.name=name;
	}
	MethodOverloading(String name,int pwd)
	{
	this.name=name;
	this.pwd=pwd;
	}
	MethodOverloading(String name,int pwd,double price)
	{
	this.name=name;
	this.pwd=pwd;
	this.price=price;
	}
	
}
