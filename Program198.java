/*
     E
    dd
   CCC
  bbbb
 AAAAA
  bbbb
   CCC
    dd
     E
*/
class Program198
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				if(i%2==0)
				System.out.print((char)(i+96));
				else
				System.out.print((char)(i+64));
			}
		System.out.println();
		}		

		for(int i=1+1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				if(i%2==0)
				System.out.print((char)(i+96));
				else
				System.out.print((char)(i+64));
			}
		System.out.println();
		}
}
}
		