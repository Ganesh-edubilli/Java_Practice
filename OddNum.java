//while write a JAVAprogras to print all odd number between 1 to 160

//importing the Scanner class
import java.util.Scanner;
class OddNum
  {
    //main method
    public static void main(String[] args)
    {
      //associting Scanner class
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the n value");
      //declearing variable
      
     int n,i=1,sum=0;
      n=sc.nextInt();
      while(i<=n)
        {
          //conditin for odd number
          if(i%2!=0)
          System.out.println(i);
          i++;
         
        }
     
      }
  }