//write a Java program to print all even numbers between 1 to 100

//importing the Scanner class
import java.util.Scanner;
class EvenNumber
  {
    //main method
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the n value");
     
      int n,i=1,sum=0;
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0)
          System.out.println(i);
          i++;
         
        }
     
      }
  }