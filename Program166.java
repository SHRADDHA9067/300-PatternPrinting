/*
Ee	Id	Lc	Nb	Oa
	Di	Hh	Kg	Mf
		Cl	Gk	Jj
			Bn	Fm
				Ao
5	9	12	14	15
	4	8	11	13
		3	7	10
			2	6
				1

5	4	3	2	1
	9	8	7	6
		12	11	10
			14	13
				15		
*/
class Program166
{
	public static void main(String args[])
	{
		int n=5;
		int count1=n;
		int count2=n;
		for(int i=1,i1=n;i<=n||i1>=1;i++,i1--)
		{
			int c1=count1;
			int c2=count2;
		
			for(int j=i;j>1;j--)
			{
				System.out.print("\t");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(c1+64));
				System.out.print((char)(c2+96));
				System.out.print("\t");
				c1+=j-1;
				c2--;
			}
		count1--;
		count2+=i1-1;
		System.out.println();
		}
	}
}
			