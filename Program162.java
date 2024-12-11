/*
Ao	
Bn	Cm
Dl	Ek	Fj
Gi	Hh	Ig	Jf
Ke	Ld	Mc	Nb	Oa

1
2	3
4	5	6
7	8	9	10
11	12	13	14	15

15
14	13
12	11	10
9	8	7	6
5	4	3	2	1

*/
class Program162
{
	public static void main(String args[])
	{
		int n=5;
		int count1=1;
		int count2=(n*(n+1)/2);

		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(count1+64));
				System.out.print((char)(count2+96));
				System.out.print("\t");
				count1++;
				count2--;
			}
		System.out.println();
		}
	}
}
			
			
		