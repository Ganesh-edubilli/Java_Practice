//write a JAVAprogram to find first and last digit of a number

import java.util.Scanner;
//class
class FirstLastNum
  {
    //define main method
    public static void main(String[] args)
    {
      //associating the the Scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the digit:");
      int n=sc.nextInt();
      int firstdigit=0;
      int lastdigit=n%10;
      while(n!=0)
        {
          firstdigit=n%10;
          n/=10;
        }
      System.out.println("first digit:");
      System.out.println(firstdigit);
      System.out.println("last digit:");
        System.out.println(lastdigit);
    }
  }
