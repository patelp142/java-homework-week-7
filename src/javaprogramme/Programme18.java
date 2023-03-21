package javaprogramme;

/**
 * 18. Write a Java program to sum values of an array.
 */

public class Programme18 {
    public static void main(String[] args) {
        double input[] = {12.22, 42, 13, 56, 78, 23, 85, 46, 91, 10};
        double sum = 0;
        for (double i : input)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
