package com.demos;

public class Calculator {
	int a;
public static void Add(int i,int j)
{
	int a;
	 a=i+j;
	 System.out.println(a);
	//System.out.print("a value is:",a);
}
public static void Multiply(int i,int j)
{
	int a;
	 a=i*j;
	System.out.println(a);
}
public static void Divide(int i,int j)
{
	int a;
	 a=i/j;
	System.out.println(a);
}
public static void Subtract(int i,int j)
{
	int a;
	if (i>j) {
		
		 a=i-j;
		 System.out.println(a);
	} 
	else
	{
		 a=j-i;
		 System.out.println(a);
	}
	 
}
}
