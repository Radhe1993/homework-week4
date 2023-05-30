package homework;

// 11. Even Digit Sum
//Write a method named getEvenDigitSum with one parameter of type int called number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.

public class EvenDigitSum11
{
    public static int getEvenDigitSum(int number)
    {
        int i=1,n,sum=0,digit;

        if(number<0)
      {
          return -1;
      }
      while(number>0)
      {
          digit = number%10;
          if(digit%2==0)
          {
              sum+=digit;
          }
          number = number/10;
      }
      return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of even number = "+ getEvenDigitSum( 123456789));
        System.out.println("sum of even number = "+getEvenDigitSum(252));
        System.out.println("sum of negative number = "+getEvenDigitSum(-22));
    }
}
