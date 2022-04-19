//write program to count number of dizits in a number

//importing the Scanner class
import java.util.Scanner;
//define the class name

class CountDigit
  {
    //define the main method
    public static void main(String[] args)
    {

    //associating Scanner class
    Scanner sc=new Scanner(System.in);
    //declearing and initializing the variables
    
    int n=sc.nextInt();
    int count=0;
    while(n!=0)
      {
        n /=10;
        count++;
      }
        System.out.println(count);
    }
  }