/*
----a
---ba
--cba
-dcba
edcba
*/

class Program71
{
	public static void main(String args[])
	{
		for(char i='a';i<='e';i++)
		{
			for(char j=i;j<='e';j++)
			{
				System.out.print(" ");
			}
			for(char j=i;j>='a';j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}
	