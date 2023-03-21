package javaprogramme;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or  “ZERO”
 */

public class Programme16 {
    public static void main(String []s)
    {
        int num;
        //Scanner to read value
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        num=input.nextInt();

        //check condition for +ve, -ve and Zero
        if(num>0)
            System.out.println(num + " is POSITIVE NUMBER.");
        else if(num<0)
            System.out.println(num + " is NEGATIVE NUMBER.");
        else
            System.out.println("IT's ZERO.");
    }
}
