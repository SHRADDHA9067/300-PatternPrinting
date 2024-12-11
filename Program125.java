/*
				K
			G	L
		D	H	M
	B	E	I	N
A	C	F	J	O

				11
			7	12
		4	8	13
	2	5	9	14
1	3	6	10	15
	
*/
class Program125
{
	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n+1)/2);
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(c+64));
				c-=j;
			}
		count-=i+1;
		System.out.println();
		}
	}
}



