package homework;

// 10. Write a program to input any number and check if it Armstrong number or not
//153 = (1*1*1)+(5*5*5)+(3*3*3)
//where:
//(1*1*1)=1
//(5*5*5)=125
//(3*3*3)=27
//So:
//1+125+27=153

import java.util.Scanner;

public class Armstrong10
{
    public static void armstrong()
    {
        int i,n,sum,r,rev=0;
        Scanner ob = new Scanner(System.in);
        System.out.print("number = ");
        n = ob.nextInt();
        sum = n;
        while(n>0)
        {
            r = n%10;
            rev = rev+(r*r*r);
            n = n/10;
        }
        if(sum==rev)
        {
            System.out.println("Armstrong number = "+sum);
        }
        else
        {
            System.out.println("Not Armstrong number = "+sum);
        }

    }

    public static void main(String[] args)
    {
        armstrong();

    }
}
