import java.util.Scanner;
class p6
{
public static void main(String [] args)
{
   Scanner sc= new Scanner(System.in);
   System.out.println("Enter the first number");
   int i=sc.nextInt();
   System.out.println("Enter the second number");
   int j=sc.nextInt();
   System.out.println("The addition is "+i+"+"+j+"="+ (i+j));
   System.out.println("The substraction is "+i+"-"+j+"="+ (i-j));
   System.out.println("The multiplication is "+i+"*"+j+"="+ i*j);
   System.out.println("The division is "+i+"/"+j+"="+ i/j);
   System.out.println("The mod is "+i+"%"+j+"="+ i%j);  
}
}