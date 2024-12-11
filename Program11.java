//Write a program to find compound intrest
//formula=compound intrest=p(1+r/t)^nt

class Program11
{
	public static void main(String args[])
		{
			int p=12;
			int r=10;
			int n=4;
			int t=8;
			double a=Math.pow(1+r/t,n*t);
			System.out.println("a="+a);
		}
}
