/*
54321
 4321
  321
   21
    1
   21
  321
 4321
54321
*/

class Program206
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		for(int i=2;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}

}}