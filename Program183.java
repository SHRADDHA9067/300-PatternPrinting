class Program183
{
	public static void main(String args[])
	{
		int n=8;
		int count1=n*(n+1)/2;
                int count2=n*(n+1)/2;
		for(int i=1,i1=n;i<=n||i1>=1;i++,i1--)
		{
			int c1=count1;
			int c2=count2;
			for(int j1=i1;j1>=1;j1--)
			{
				System.out.print((char)(c1+64));
				c1-=j1;
				System.out.print("\t");
			}
			for(int j=n; j>=i; j--)
			{
				
				System.out.print(c2);
				System.out.print("\t");
				c2+=j;
			}
	System.out.println();
	count1--;
	count2-=i1;
}}}
				
