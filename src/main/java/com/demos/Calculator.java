package com.demos;

public class Calculator {
public static int Add(int i,int j)
{
	return i+j;
}
public static int Multiply(int i,int j)
{
	return i*j;
}
public static int Divide(int i,int j)
{
	return i/j;
}
public static int Subtract(int i,int j)
{
	if (i>j) {
		return i-j;
	} 
	else
	{
		return j-i;
	}
	 
}
}
