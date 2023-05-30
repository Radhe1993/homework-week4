package homework;

// 12. Write a programme to input any number and check if it is prime or not.
//(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
//prime numbers can't be divided by other

import java.util.Scanner;

public class Prime12
{
    public static void prime()
    {
        int i,n,p,j;
        Scanner ob = new Scanner(System.in);
        System.out.print("number = ");
        n= ob.nextInt();

        for(i=1;i<=n;i++)
        {
            p=0;
            for(j=2;j<i;j++)
            {

                if(i%j==0)
                {
                   p++;
                   break;
                }
            }
            if(p==0)
            {
                System.out.println("Number is prime = "+i);
            }
        }

    }

    public static void main(String[] args) {
        prime();
    }


}
