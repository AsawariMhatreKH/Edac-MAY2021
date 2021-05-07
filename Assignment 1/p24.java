import java.util.Scanner;
class p23
{
	public static void main(String[] args)
	{
	int i=0,k=0,count;
	String b="";
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your number in 10101 form");
	 int a= sc.nextInt();
		while(a!=0)
		{  count=0;
			while(count!=4)
			{
			int c=(a%10);
		     b=b+c;
			 a/=10;
			 count++;
			}
			a = Integer.parseInt(b);
		    /*double l=Math.pow(2,i);
		    k=k+((int)l*(%10));
		    a=a/10;
		    i++;*/
		}
     System.out.println("The Binary To HexaDecimal Conversion Is "+a);
		
		
	}
}