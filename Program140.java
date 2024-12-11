/*
				A
			C	B
		F	E	D
	J	I	H	G
O	N	M	L	K

				1
			3	2
		6	5	4
	10	9	8	7
15	14	13	12	11
*/
		

class Program140
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			int c=count;
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(c+64));
				c--;
			}
		count+=i+1;
		System.out.println();
		}
	}
}