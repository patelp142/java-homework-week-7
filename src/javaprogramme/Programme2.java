package javaprogramme;

import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */

public class Programme2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             //scanner declaration
        System.out.println("Input the year: ");             //print command for outcome
        int year = input.nextInt();

        if (year % 4 == 0) {                                //use of modulus and if syntax
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        input.close();
    }

}
