/*
----e
---de
--cde
-bcde
abcde
*/
class Program73
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
				System.out.print(j);
			}
		System.out.println();
		}
	}
}