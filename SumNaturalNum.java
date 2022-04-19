//write a java program to find sum of all natural numbers between 1 to n.

//import class
import java.util.Scanner;
//define class name
 class SumNaturalNum
   {
     //define main method
     public static void main(String[] args)
     {
       //declearing variables
       int n=1,sum=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("sum of all n numbers");
       n=sc.nextInt();
       int i;
       //condition for sum of natural numbers
       for(i=1; i<=n;i++)
         {
           sum += i;
          }
       System.out.println(sum);
      }
   }
//result
