/*
E
E D
E D C
E D C B
E D C B A
*/

class Program47
{
	public static void main(String args[])
		{
			for(char i='E';i>='A';i--)
			{
				for(char j='E';j>=i;j--)
				{
					System.out.print(j);
				}
			System.out.println();
			}
		}
}

