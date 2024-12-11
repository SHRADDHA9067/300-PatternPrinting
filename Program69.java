/*
----e
---dd
--ccc
-bbbb
aaaaa
*/

class Program69
{
	public static void main(String args[])
	{
		for(char i='e';i>='a';i--)
		{
			for(char j=i;j>'a';j--)
			{
				System.out.print(" ");
			}
			for(char j=i;j<='e';j++)
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}
}
