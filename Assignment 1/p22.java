import java.util.Scanner;
class p21
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
			r=a%8;
			a=a/8;
	        b=r+b;
		}
     System.out.println("The Decimal To Octal Conversion Is "+b);
		
		
	}
}