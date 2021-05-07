import java.util.Scanner;
class p15
{
 public static void main(String [] args)
 {
   Scanner sc= new Scanner(System.in);
   int i= sc.nextInt();
   int j= sc.nextInt();
   System.out.println("Before the swapping....");
    System.out.println("First Number " +i);
	System.out.println("Second Number "+j);
	i=i+j;
    j=i-j;
    i=i-j;
	System.out.println("Before the swapping....");
    System.out.println("First Number " +i);
	System.out.println("Second Number "+j);
   
 }
}