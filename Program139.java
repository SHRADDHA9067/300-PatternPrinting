/*
				O
			N	M
		L	K	J
	I	H	G	H
E	D	C	B	A

				15
			14	13
		12	11	10
	9	8	7	6
5	4	3	2	1
	
*/

class Program139
{
	public static void main(String args[])
	{
		int n=5;
		int count=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(count+64));
				count--;
			}

		System.out.println();
		}
	}
}