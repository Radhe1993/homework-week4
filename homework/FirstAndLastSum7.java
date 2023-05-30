package homework;

// 7. First And Last Digit Sum
//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and the last digit of the parameter number passed to the method,
//using a loop and return the sum of the first and the last digit of that number.
//If the number is negative then the method needs to return -1 to indicate an invalid value.

public class FirstAndLastSum7
{

    public static int sumFirstAndLastDigit(int number)
    {
        int last;

        last = number%10;

        while (number>=10)
        {
           number = number/10;

        }
        if(number<0)
        {
            return -1;
        }

            return number+last;

    }

    public static void main(String[] args)
    {
        System.out.println(sumFirstAndLastDigit(242));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
