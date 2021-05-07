import java.util.Scanner;
class p19
{
	public static void main(String[] args)
	{
     int r;
	 String b="";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number");
	 int a= sc.nextInt();
		while(a!=0)
		{  
			r=a%2;
			a=a/2;
	        b=r+b;
		}
     System.out.println("The Decimal To Binary Conversion Is "+b);
		
		
	}
}