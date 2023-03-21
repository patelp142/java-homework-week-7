package javaprogramme;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even
 */

public class Programme1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         //Scanner declaration

        System.out.println("Enter a number: ");         //print result in console
        int a = input.nextInt();

        String ans = a % 2 == 0 ? "This number is even" : "This number is odd";     //use of modulus
        System.out.println(ans);

        input.close();
    }
}
