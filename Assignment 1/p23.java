import java.util.Scanner;
class p22
{
	public static void main(String[] args)
	{
	int i=0,k=0;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number in 10101 form");
	 int a= sc.nextInt();
		while(a!=0)
		{  
	       double l=Math.pow(2,i);
		   k=k+((int)l*(a%10));
		   a=a/10;
		   i++;
		}
     System.out.println("The Binary To Decimal Conversion Is "+k);
		
		
	}
}