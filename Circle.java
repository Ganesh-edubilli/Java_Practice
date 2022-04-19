//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Circle { 

//Define main method
public static void main(String[] args)
  {
  
//Declare the variables
double radius;
  
Scanner sc=new Scanner(System.in);
  System.out.println("enter radius as a positive integer");
radius=sc.nextDouble();
double pi = 3.14;
//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/

//Caluculate the circumference of the circle
double circle = 2*pi*radius;
//Casting the floating-point value to int  
int c = (int) circle;
//Print the Result
    System.out.println(c);
    }
} 