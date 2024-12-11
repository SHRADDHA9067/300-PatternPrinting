/*
	
*/
class Programd
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=(n*(n+1)/2);
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
		
			for(int j=i,j1=n;j<=n||j1>=i;j++,j1--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.println();
				c1+=j;
				c2-=j1;
			}
		count1-=i+1;
		count2--;
		
		System.out.println();
		}
	}
}