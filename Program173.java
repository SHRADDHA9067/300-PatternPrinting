/*
11111
12222
12333
12344
12345
*/
class Program173
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print(i>j?j:i);
			}
		System.out.println();
		}
	}
}