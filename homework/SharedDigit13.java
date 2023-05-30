package homework;

// 13. Shared Digit
//Write a method named hasSharedDigit with two parameters of type int.
//Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
//within the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;

import java.util.Scanner;

public class SharedDigit13
{
    public static boolean hasSharedDigit(int a,int b)
    {

        if (a <= 10 || b >= 99)

            return false;

         int  x = a % 10;
         int  y = b % 10;
            a = a / 10;
            b = b / 10;
            return (a == b || x == y || x == b || a == y);


    }

    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.print("a = ");
        int  a = ob.nextInt();
        System.out.print("b = ");
        int  b = ob.nextInt();
        System.out.println("Number is not in a range 10-99 = "+hasSharedDigit(9,100));
        System.out.println("Digit should be appears in both of number = "+hasSharedDigit(a,b));
    }
}
