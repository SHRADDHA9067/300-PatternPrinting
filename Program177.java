/*
54321
44321
33321
22221
11111
*/
class Program177
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--)
			{
				System.out.print(i>j?j:i);
			}
		System.out.println();
		}
	}
}