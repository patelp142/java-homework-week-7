package javaprogramme;

import java.util.Scanner;

/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */

public class Programme6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = input.nextInt();
        input.close();

        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");
        }
    }
}
