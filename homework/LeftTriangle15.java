package homework;
//15. Display left angle triangle of * using nested for loops
//*
//* *
//* * *
//* * * *
//* * * * *

import java.util.Scanner;

public class LeftTriangle15
{
    public static void pettern()
    {
        int i,n,j,k;
        Scanner ob = new Scanner(System.in);
        System.out.println("n = ");
        n = ob.nextInt();
        for(i=1;i<=n;i++)
        {
            for(k=1;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pettern();
    }
}
