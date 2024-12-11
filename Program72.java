/*
----E
---ED
--EDC
-EDCB
EDCBA

*/
class Program72
{
	public static void main(String args[])
	{
		for(char i='E';i>='A';i--)
		{
			for(char j=i;j>'A';j--)
			{
				System.out.print(" ");
			}
			for(char j='E';j>=i;j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}