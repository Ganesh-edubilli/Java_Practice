//Write a JAVAprogram to print all natural numbers from 1 to a.

//importing the Scanner class
import java.util.Scanner;
//positive class
class NaturalNumbers
  {

    //main method
    public static void main(String[] args)
    {
      // Associating Scanner class
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value of n");
      //declaring and intializing the variables
      int n=sc.nextInt();
      int i;
      for(i=1; i<=n;i++)
      {
        System.out.println(i);
        
      }
    }
  }