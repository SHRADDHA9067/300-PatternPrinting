/*
Ae
Fd	Bi
Jc	Gh	Cl
Mb	Kg	Hk	Dn
Oa	Nf	Lj	Im	Eo

1	
6	2
10	7	3
13	11	8	4
15	14	12	9	5

5
4	9
3	8	12
2	7	11	14
1	6	10	13	15

*/

class Program163
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=n;
		for(int i=n;i>=1;i--)
		{
			int c1=count1;
			int c2=count2;
			for(int j=i,j1=n;j1<=i||j<=n;j++,j1++)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1-=j;
				c2+=j+1;
			}
		count1+=i;
		count2--;
		System.out.println();
		}
	}
}
			