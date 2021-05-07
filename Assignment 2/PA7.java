class PA7                                       
{
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)      //ROWS
		{
			for(int j=1;j<=i;j++)   //COLUMN:spaces
			{
			System.out.print(" ");
			}
			for(int j=i;j<=5;j++)   //COLUMN:star
			{
			System.out.print(" "+j);
			}
			
			System.out.println();
		}
	}
}
			