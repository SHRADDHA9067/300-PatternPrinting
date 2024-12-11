/*
----------Control Structure:
By using control Structure we can control flow of execution
By using control structure we can execute code as per requirement
---------------------------------------------------------------------------------------------------------------------------------------
Types of Control Structure-
1) if condition 
2)if-else condition
3)if else if condition
4)Nested if condition
5)switch condition
6)special condition
---------------------------------------------------------------------------------------------------------------------------------------
1)if condition
 To create if condition we can use if keyword
 Syntax:
if(condition)
{
	//statement;
}
-To execute if condition it requires boolean true value
-To make a condition we can use relational and logical operator
-eg
class Programif
{
	public static void main(String args[])
	{
		int a=50;
		if(a<=100)
		{
			System.out.println("we are in the if condition");
		}
	}
}
-when there is only one condition there is no {} is require
--------------------------------------------------------------------------------------------------------------------------------------
2)if-else condition
-To create if-else condition we can use if and else keyword
-syntax
if(condition)
	{
		//statement;
	{
    else
	{
		//statement;
	}
-to execute if it requires bollean true value
-to make a condition we can use relational and logical operator
-else part gets execute when if condition gets unsatisfied
-else part can be used to provide an alternative

Syntax-
int i=50;
if(i>=100)
{
	System.out.println("we are in if condition");
}
else{
	System.out.println("we are in else condition");
}
eg

class Programelse
{
	public static void main(String args[])
	{
		int i=80;
		if(i>=100)
			{
				System.out.println("we are in if condition");
			}
		else 
			{
				System.out.println("we are in else condition");
			}
	}
}
--------------------------------------------------------------------------------------------------------------------------------------3)if else if condition
-it is a combination of if and else condition

syntax-
if(condition)
	{
		//statement;
 	}
	else if(condition)
	{
		//statement;
	}
	else if(condition)
	{
		//statement;
	}
	else if(condition)
	{
		//statement;
	}
	else 
	{
		//statement;
	}

eg class Programifelseif
{
	public static void main(String args[])
	{
		double p=60.52;
		if(p>=80)
		{
			System.out.println("Distiction");
		}
		else if(p>=70)
		{
			System.out.println("First class");
		}
		else if(p>=60)
		{
			System.out.println("Second class");
		}
		else if(p>=50)
		{
			System.out.println("third class");
		}
		else
		{
			System.out.println("failed");
		}
	}
}
			

		

	


