import java.util.Scanner;

public class Try
{
   public static void main(String[] args)
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter the number: ");
      int number=scan.nextInt();
      int sum=0;
      
      for(int i=1;i<=number;i++)
      {
         sum+=i;
      }
      
      System.out.println("Answer: "+sum);
      
   }
}
