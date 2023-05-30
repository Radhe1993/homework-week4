package homework;

//4. Digit Sum Challenge
//Write a method with the name sumDigits that has one int parameter called number.

public class DigitSumChallenge4
{

    public static int sumDigits(int number) {
        int sum = 0;
        int input = number;
        while (input > 0) {

            if (input != 0) {
                sum = sum + input % 10;

                input = input / 10;

            }
            else
            {
                System.out.println("number is invalid ");
                return -1;
            }

        }
        return sum;
    }
        public static void main (String[]args)
        {
            int total = sumDigits(125);

            System.out.println("sum of digit = " + total);



        }
    }
