class PA2
{
	public static void main(String[] args)
	{ 
		char ch=65;
		for(int i=0;i<=4;i++)      //ROWS
		{
			for(int j=0;j<=i;j++)   //COLUMN
			{
			System.out.print((char)(ch+j));
			}
			System.out.println();
		}
	}
}