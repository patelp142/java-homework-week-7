package javaprogramme;

import java.util.Scanner;

/**
 * 10.Write a java program to input any two number and ask user to enter
 * their symbol (+, -,  /, *) find addition, Subtraction, multiplication and division
 * according to their symbol  (using if else)
 */

public class Programme10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        float num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        float num2 = input.nextInt();
        System.out.print("Enter the command you want to execute (+, -, *, /) : ");
        char ch = input.next().charAt(0);
        input.close();

        if (ch == '+') {
            System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (ch == '-') {
            System.out.println("Subtraction of " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (ch == '*') {
            System.out.println("Multiplication of " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (ch == '/') {
            System.out.println("Division of " + num1 + " / " + num2 + " = " + (num1 / num2));
        }
    }
}
