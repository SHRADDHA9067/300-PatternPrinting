/*
*****
   *
  * 
 *
*****
*/
class Program276
{
	public static void main(String args[])
	{
		int n=15;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||i==n||(i+j)==n+1)
					System.out.print(j);
				else
					System.out.print(" ");
			}
		System.out.println();
		}
	}
}