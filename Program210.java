/*
AAAAA
 bbbb
  CCC
   dd
    E
   dd
  CCC
 bbbb
AAAAA
*/
class Program210
{
	public static void main(String rgs[])
	{	
		int n=5;
		for(int i=1;i<=n;i++)
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
		for(int i=n-1;i>=1;i--)
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