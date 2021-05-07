import java.util.Scanner;
class p7
{
public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter one number...");
 int i=sc.nextInt();
 System.out.println("The table of " +i+ " is");
 for(int j=1;j<=10;j++)
 {
    System.out.println(i+"*"+j+ "=" +(i*j));
 }
 
}
}