/*
OMJFA
NKGB
LHC
ID
E

15	13	10	6	1
14	11	7	2
12	8	3
9	4
5

*/
class Program136
{
	public static void main(String args[])
	{
		int n=5;
		int count=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				c-=j+1;
			}
			count-=i;
			System.out.println();
		}
	}
}