//Write a Java program to find sum of all even numbers between 1 to n.
//import class
import java.util.Scanner;
//define class name
 class SumEvenNum
   {
     //define main method
     public static void main(String[] args)
     {
       //associating Scanner class
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int i=1;
       int sum=0;
       while(i<=n)
         {
           //condition for sum of even numbers
           if(i%2==0)
           
             sum +=i;
             i++;
           } 
             System.out.println(sum);
       
     }
    }
   
