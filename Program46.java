/*
a
b a
c b a
d c b a
e d c b a
*/
class Program46
{
	public static void main(String args[])
	{
		for(char i='a';i<='e';i++)
		{
			for(char j=i;j>='a';j--)
			{
				System.out.print(j);
			}
		System.out.println();
		}
	}
}