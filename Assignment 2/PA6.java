class PA6                                    
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)      //ROWS
		{
			for(int j=5;j>=i;j--)   //COLUMN:spaces
			{
			System.out.print(" ");
			}
			for(int j=1;j<=i;j++)   //COLUMN:star
			{
			System.out.print("*");
			}
			
			System.out.println();
		}
	}
}