class PA18
{
	public static void main(String[] args)
	{
		int n=64;
       for(int i=5;i>=1;i--)
	   {
			for(int j=1;j<=i;j++)
			{
		     System.out.print(" "+(char)(j+n));
			}
			/*for(int k=2;k<=4;k++)
			{
				System.out.print(" ");
			}*/
			System.out.println();
	   }
	}
}