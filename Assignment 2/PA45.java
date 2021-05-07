class PA45
{ 
	public static void main(String [] args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("-");
			}
		for(int j=1;j<2*i;j++)
		{
		  if(j==1|j==(2*i-1)|(i==6 && j%2==1))
          System.out.print("*");
		  else
		  System.out.print(" ");
		}
		System.out.println();
		}
  }
}