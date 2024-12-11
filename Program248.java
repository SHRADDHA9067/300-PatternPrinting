/*
111111111
 2222222
  33333
   444
    5
*/
class Program248
{
	public static void main(String args[])
	{
		int n=5;
		/*for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int j=1;j<=(n*2-i)+1-i;j++)
				System.out.print(i);
		*/
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++)
				System.out.print(n-i+1);
				

			System.out.println();
		}
	}
}