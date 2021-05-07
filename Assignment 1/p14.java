import java.util.Scanner;
class p13
{	public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a width for rectangle");
	float W=sc.nextFloat();
	System.out.println("enter a length for rectangle");
	float L=sc.nextFloat();
	float A=W*L;
	float P=((2*(W+L)));
	System.out.println("the area of the rectangle is "+W+ "*" +L+ "=" +A);
	System.out.println("the perimeter of the rectangle is 2*("+W+ "+" +L+ ")="+P);
	}
}