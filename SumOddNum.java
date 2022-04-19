// write a program to print sum of odd numbers

//import class
import java.util.Scanner;
//define class name
class SumOddNum
  {
    //define the main method
    public static void main(String[] args)
    {
      //associating Scanner class
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      int sum=0;
      while(i<=n)
        {
          //condition for sum the odd numbers
          if(i%2!=0)
            sum +=i;
          //sum=sum+i
          i++;
        }
      System.out.println(sum);
    }
  }