import java.util.Scanner;
class p11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a radius");
		float r=sc.nextFloat();
		double A= Math.PI*r*r;
		double P= 2*Math.PI*r;
		System.out.println("Area is: " +A);
		System.out.println("Perimeter is: " +P);
		
	}
	
}