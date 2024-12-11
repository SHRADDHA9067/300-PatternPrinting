class Program182
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=1;
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i;j<=n;j++)
			{
				 
				
				System.out.print((char)(c1+96)); 
				System.out.print((char)(c2+64));
				System.out.print("\t");
				
				c1+=j+1;
				c2+=j;
			}
	System.out.println();
	count1+=i;
	count2+=i+1;
}}}
		
