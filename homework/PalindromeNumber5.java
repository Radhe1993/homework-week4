package homework;

// 5. Palindrome Number
//Write a method called isPalindrome with one int parameter called number

import java.util.Scanner;

public class PalindromeNumber5
{
    public static boolean isPalindrome(int number)
    {
        int peli, rev=0,lastDigit;
        boolean result = false ;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number : ");
        number = ob.nextInt();
        peli = number;
        while (number>0)
        {
           lastDigit  = number%10;
            number = number/10;
            rev = rev*10+lastDigit;

        }
        if(peli==rev)
        {
           result = true;
            System.out.println("Number is palindome = "+peli);


        }
        else
        {
            result = false;
            System.out.println("Number is not palindrom = "+peli);

        }
        return result;
    }

    public static void main(String[] args)
    {
        isPalindrome(121);

    }
}
