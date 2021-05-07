import java.util.Scanner;
class p18
{
	public static void main(String[] args)
	{
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter your 1st number");
	 String a= sc.next();
	 System.out.println("enter your 2nd number");
	 String b= sc.next();
	 int n1=Integer.parseInt(a,2);
     int n2=Integer.parseInt(b,2);
	 int n3=n1*n2;
	 System.out.println("n1 :" +Integer.toBinaryString(n1));
	 System.out.println("n2 :" +Integer.toBinaryString(n2));
	  System.out.println("n3=n1*n2 :" +Integer.toBinaryString(n3));
	 
	}
}