class PA5
{
	public static void main(String[] args)
	{ int ch=64;
		for(int i=0;i<=5;i++)      //ROWS
		{
			for(int j=1;j<=i;j++)   //COLUMN
			{
			System.out.print((char)(ch+i));
			}
			System.out.println();
		}
	}
}