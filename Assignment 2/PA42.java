class PA42
{
	public static void main(String [] args)
	{
		for(int i=6;i>=1;i--)
		{
			for(int j=2;j<=7-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
		      System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}