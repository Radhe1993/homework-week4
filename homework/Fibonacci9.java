package homework;
// 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
import java.util.Scanner;

public class Fibonacci9
{
    public static void fibona()
    {

        int  i,n, a=1, b=0, c;
        Scanner ob = new Scanner(System.in);
        System.out.println("n = ");
        n = ob.nextInt();
        for (i=1; i<=n; i++)
        {
           c=a+b;
            System.out.println(c);
            a=b;
            b=c;


        }
    }

    public static void main(String[] args) {
        fibona();
    }

}
