package homework;
// 2. -Read the numbers from the console entered by the user and print the minimum
//and maximum number the user has entered.
//-Before the user enters the number, print the message Enter number:
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {
    int i = 1, n,minimum=1,maximum=0;

    public void min() {

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the number n = ");
        n = ob.nextInt();
        while (i <= n)
        {
            if (maximum < i) {

                maximum = i;
                i++;

            }
        }
        System.out.println("Maximum Number = " + maximum);
        
        while(i<=n)
        {

               if (i<minimum)
            {
                minimum = i;
                i++;

            }


        }

        System.out.println("Minimum Number = " + minimum);

    }


    public static void main(String[] args) {
            MinAndMaxInputChallenge2 obj = new MinAndMaxInputChallenge2();
            obj.min();

    }
}
