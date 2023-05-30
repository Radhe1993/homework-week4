package homework;
//1. Read 10 numbers from the console entered by the user and print the sum of those
//numbers.
//-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
//-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
//10 numbers.
//-Use the nextInt() method to get the number and add it to the sum.
//-Before the user enters each number, print the message Enter number #x: where x represents the

import java.util.Scanner;

public class ReadingUserInputChallange1
{
    public  void sum()
    {
        int i=1,n,counter=0;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number = ");
        n = ob.nextInt();
        while(i<=n)
        {
            counter = counter+i;
            i++;

        }
        System.out.println("Sum of 1 to 10 number = "+counter);
    }

    public static void main(String[] args)
    {
        ReadingUserInputChallange1 obj = new ReadingUserInputChallange1();
        obj.sum();

    }
}
