/*
54321
5432
543
54
5
54
543
5432
54321
*/

class Program186
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
			
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j);
			}
		System.out.println();
	        }
       }
}