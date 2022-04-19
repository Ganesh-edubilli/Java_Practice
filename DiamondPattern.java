/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

//class DiamondPattern {
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'a';
        for (int i = 1; i < (n * 2); i++) 
        {
            for (int spc = n - count2; spc > 0; spc--)   
            {
                System.out.print("   ");
            }
            if (i < n) 
            {
                count2++;
            } 
            else 
            {
                count2--;
            }
            for (int j = 0; j < count; j++) 
          {
                System.out.print(" "+c+" ");
                if (j < count / 2) 
                {
                    c++;
                } else 
                {
                    c--;
                }
            }
            if (i < n)
            {
                count = count + 2;
            } 
            else
            {
                count = count - 2;
            }
            c = 'a';
            System.out.println();
        }
    }
}


//Add main method here
//class DiamondPattern
  
//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
     