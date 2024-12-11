/*print A A A A A
	B B B B B
	C C C C C
	D D D D D
	E E E E E
*/
class Program24
{
	public static void main(String args[])
	{
		for (char j='A';j<='E';j++)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
}