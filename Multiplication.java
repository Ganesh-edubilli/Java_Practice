//write a program to print multiplication table of any number.

import java.util.Scanner;
class Multiplication
  {
    //main method
    public static void main(String[] args)
    {
      //Scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      // intializing the n as interger
      int n=sc.nextInt();
      for(int i=1;i<=10;i++)
        {
          ///format for the multiplication and also included the operation
          System.out.println(n+"*"+i+"="+(n*i));
       
          }
      }
  }