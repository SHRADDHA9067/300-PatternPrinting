/*
EEEEEEEEE
 ddddddd
  CCCCC
   bbb
    A
*/
class Program262
{
	public static void main(String args[])
	{
		int n=5;
		/*for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int j=1;j<=(n-i+1)*2-1;j++)
				System.out.print((i%2==0)?(char)(n-i+1+96):(char)(n-i+1+64));
		*/
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=1;j<=i*2-1;j++)
				System.out.print((i%2==0)?(char)(i+96):(char)(i+64));
			System.out.println();
		}
	}
}
