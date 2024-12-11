//write a program to swap 2 values without using 3 rd variable

class program2
{
	public static void main(String args[])
	{
		int num1=1000;
		int num2=500;
		num1=num1+num2;  //donhi value chi sum kara ani kontya pn 1 variable madhe store kara num2=num1+num2
		num2=num1-num2;
		num1=num1-num2;
                System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}

