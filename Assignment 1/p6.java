import java.util.Scanner;
class p5
{
 public static void main(String[] args)
 {
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the first number");
 int i=sc.nextInt();
 System.out.println("Enter the second number");
 int j=sc.nextInt();
 int k= i*j;
 System.out.println("The multiplication is " +i+"*"+j+"="+k);
 }
}