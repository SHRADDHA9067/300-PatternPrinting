/*
A
B B 
C C C
D D D D
E E E E E
*/
class Program44
{
	public static void main(String args[])
	{
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}
}