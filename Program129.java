/*
KLMNO
GHIJ
DEF
BC
A

11	12	13	14	15
7	8	9	10
4	5	6
2	3
1

*/
class Program129
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1)/2)-(n-1);
		for(int i=n;i>=1;i--)
		{
			int c=count;
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(c+64));
				c++;
			}
			count-=i-1;
			System.out.println();
		}
	}
}