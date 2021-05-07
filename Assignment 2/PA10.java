class PA10
{	
	public static void main(String[] args)
	{
	  int ch=64;
      for(int i=5;i>=1;i--)
	  {
		for( int j=1;j<=i-1;j++)
		{
		System.out.print(" ");
		}
		for(int j=i;j<=5;j++)
		{
		 System.out.print(" " +((char)(ch+j)));
		}
		  System.out.println();
	  }
	}
}