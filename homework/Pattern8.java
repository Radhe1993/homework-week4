package homework;
// 8. Display right angle triangle of @ using nested for loops
//@
//@@
//@@@
//@@@@
//@@@@@

import java.util.Scanner;

public class Pattern8
{
    public static void getdata()
    {
        int i, n,j;
        Scanner ob = new Scanner(System.in);
        System.out.println("n = ");
        n = ob.nextInt();
        for(i=1; i<=n; i++)
        {
            for (j=1; j<=i; j++)
            {
                System.out.print(" @");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        getdata();
    }

}
