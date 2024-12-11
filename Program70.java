/*
----A
---AB
--ABC
-ABCD
ABCDE
*/

class Program70
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j<'E';j++)
			{
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++)
			{
				System.out.print(j);
			}
		System.out.println();
	 	}
	}
}