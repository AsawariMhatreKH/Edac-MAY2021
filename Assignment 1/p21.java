import java.util.Scanner;
class p20
{
	public static void main(String[] args)
	{
     int r;
	 String b="";
	 char[] c ={'0','1','2','3','4','5','6','7','8','9','10','A','B','C','D','E','F'};
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number");
	 int a= sc.nextInt();
		while(a!=0)
		{  
			r=a%16;
			a=a/16;
	        b=c[r]+b;
		}
     System.out.println("The Decimal To Hexadecimal Conversion Is "+b);
		
		
	}
}