//write a program to fine maximum number using ternary operator
class Special5
{
	public static void main(String args[])
	{
	int a=12,b=58,c=65,d=96,e=56;
	
	String value=(a>b)?(a>c)?(a>d)?(a>e)?"a is grater":"e is grater":
			(d>e)?"d is grater":"e is grater":
			(c>d)?(c>e)?"c is grater":"e is greater":
				(d>e)?"d is grater":"e is greater":
			(b>c)?(b>d)?(b>e)?"b is greater":"e is greater":
				(d>e)?"d is greater":"e is grater":
			(c>d)?(c>e)?"c is greater":"e is grater":
				(d>e)?"d is greater":"e is grater";

		System.out.println(value);
}
}
			