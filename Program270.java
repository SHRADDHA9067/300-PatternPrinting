/*
EdCbAbCdE
 dCbAbCd
  CbAbC
   bAb
    A
 

    
*/
class Program270
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=i;j>=1;j--)
				System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
			for(int j=1+1;j<=i;j++)
				System.out.print((j%2==0)?(char)(j+96):(char)(j+64));
		System.out.println();
		}
	}
}