/*
----A
---BB
--CCC
-DDDD
EEEEE
*/

class Program68
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j<'E';i++)
			{
				System.out.print(" ");
			}
			for(char j=i; j>='A';j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}