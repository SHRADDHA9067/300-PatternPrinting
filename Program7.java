//write a program to find simple intrest
//simple interest =p*r*t/100
//in int 4 byte 4*8 bit=32 bit  we can store 2^32=4294967296

class Program7
{
	public static void main(String args[])
	
	{
		int p=1000;
		int t=1;
		int r=1;	
		int SI=p*r*t/100;

		System.out.println("simple intrest="+SI);
	}
}