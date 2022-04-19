/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {

//main method
  public static void main(String[] args)
  {

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/
    Scanner sc=new Scanner(System.in);
    System.out.println("enter first number");
    int a=sc.nextInt();
    System.out.println("enter second number");
    int b=sc.nextInt();
/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/
    //calculate difference,product,division,increment and remainder 
    int c=a-b;
    System.out.println("Difference of 2 numbers:"+c);
    int d=a*b;
    System.out.println("Product of 2 numbers:"+d);
    int e=a/b;
    System.out.println("Division of 2 numbers:"+e);
    int f=++a;
    System.out.println("Increment of 2 numbers:"+f);
    int g=--a;
    System.out.println("decrement of 2 numbers:"+g);
    int h=a%b;
    System.out.println("remainder of 2 numbers:"+h);
    }

//print appropriate result for all operations

}

//Kindly submit the solution
