package homework;
// 3. Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel of Consonant, depending on the user input. If the user input
//Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
//error message.
//For eg:
//Input an alphabet: p
//Expected Output:
//Input letter is Consonant

import java.util.Scanner;

public class VowelAndConsonant3
{
    public static void vowel()
    {
        int i=0;
        char ch;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Character = ");
        ch = ob.next().charAt(0);
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :
                i++;
        }
        if(i==1)
        {
            System.out.println("Enter character is Vowel ="+ch);
        }
        else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        {
            System.out.println("Enter character is Consonant ="+ch);
        }
        else
        {
            System.out.println("This is not an alphabet = " +ch);
        }
    }

    public static void main(String[] args)
    {

        vowel();
    }
}
