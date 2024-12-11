/*
AbCdE
 AbCd
  AbC
   Ab
    A
   Ab
  Abc
 AbCd
AbCdE
*/
class Program211
{
	public static void main(String rgs[])
	{	
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print((char)(j+96));
				else
					System.out.print((char)(j+64));
			}
		System.out.println();
		}
		for(int i=1+1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print((char)(j+96));
				else
					System.out.print((char)(j+64));
			}
		System.out.println();
		}
	}
}