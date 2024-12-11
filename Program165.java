/*
Oo	Nj	Lf	Ic	Ea
Mn	Ki	He	Db
Jm	Gh	Cd	
Fl	Bg
Ak	

15	14	12	9	5
13	11	8	4
10	7	3
6	2
1

15	10	6	3	1
14	9	5	2
13	8	4
12	7
11		
*/
class Program165
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n*(n+1)/2;
		int count2=n*(n+1)/2;
		for(int i=1;i<=n;i++)
		{
			int c1=count1;
			int c2=count2;
		
			for(int j=i,j1=n;j<=n||j1>=i;j++,j1--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1-=j;
				c2-=j1;
			}
		count1-=i+1;
		count2--;
		System.out.println();
		}
	}
}
			