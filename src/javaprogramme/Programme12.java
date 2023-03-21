package javaprogramme;

import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */

public class Programme12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = input.next().charAt(0);

        input.close();

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SPECIAL CHARACTER.");
        }

    }
}
