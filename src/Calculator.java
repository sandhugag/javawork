
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scanner.nextInt();


        System.out.println("enter second number");
        int num2 = scanner.nextInt();

        System.out.println("enter third number");
        int num3 = scanner.nextInt();

      int  num5=0;
      int num4=0;
        int n;

        System.out.println("what do u want to do");
         n = scanner.nextInt();

         if(n == 1)
         {
             Sum(num1,num2);
             num5=num1+num2;
             System.out.println("sum of two number is "+num5);


         }
         else if(n == 2)
         {
             Sum(num1,num2,num3);
             num4=num1+num2+num3;
             System.out.println("sum of three number is "+num4);
         }







    }

    public static int  Sum(int num1, int num2)
    {
        int num3 = num1+num2;
        return num3;


    }

    public static int  Sum(int num1, int num2,int num3)
    {
        int num4 = num1+num2+num3;
        return num4;


    }
}
