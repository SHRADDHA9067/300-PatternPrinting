/*  starting la 1 ahe manun count ha 1 pasun start kara .5 line ahet manun n=5 ghya.first column pahayache sequence ni ahe ka sequence ne ahet j pahayachi garaj nhi.next row pahayche row madhe difference 1,2,3,4 nanter 2 3 4 nanter 3 4 nanter 4 yamdhe assending order ne row cha for loop lihaycha .triangle ahe manun i=j ghyaycha loop ha 1 la start karaycha ani 1 la thambvaycha
1
2	3
4	5	6
7	8	9	10
11	12	13	14	15
*/

class Program78
{
	public static void main(String args[])
	{
		int n=15;
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(count+"\t");
				count++;
			}
		System.out.println();
		}
	}
}
		