/*
55555
 4444
  333
   22 
    1
*/
class Program76
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(i);
			}
		System.out.println();
		}
	}
}