/*
EILNO
DHKM
CGJ
BF
A

5	9	12	14	15
4	8	11	13
3	7	10
2	6
1

*/
class Program131
{
	public static void main(String args[])
	{
		int n=5;
		int count=n;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(c+64));
				c+=j-1;
			}
			count--;
			System.out.println();
		}
	}
}