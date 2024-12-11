/*
				A
			B	C
		D	E	F
	G	H	I	J
K	L	M	N	O

				1
			2	3
		4	5	6
	7	8	9	10
11	12	13	14	15
*/

class Program138
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(count+64));
				count++;
			}

		System.out.println();
		}
	}
}