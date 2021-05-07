 import java.util.Scanner;
 class  p12
 {
  public static void main(String[] args)
 {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter First Number");
  int i= sc.nextInt();
   System.out.println("Enter Second Number");
  int j=sc.nextInt();
   System.out.println("Enter Third Number");
  int k= sc.nextInt();
  float l= ((i+j+k)/3);
  System.out.println("The Average Of Three Numbers Is " +l);
 }
 }