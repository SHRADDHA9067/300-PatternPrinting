/*
ABCDE      1	 2	 3	4	5
FGHI       6	 7	 8	9
JKL       10	11	12	
MN	  13	14	  
O	  15
*/

class Program126
{
	public static void main(String args[])
	{
		int n=5;
		int count=1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(count+64));
				count++;
			}
		System.out.println();
		}
	}
}
