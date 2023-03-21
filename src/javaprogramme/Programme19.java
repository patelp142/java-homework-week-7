package javaprogramme;

/**
 * 19. Write a Java program to calculate the average value of array elements.
 */

public class Programme19 {
    public static void main(String[] args) {
        int[] input = new int[] {12, 42, 13, 56, 78, 23, 85, 46, 91, 10};
        int avg = 0;
        for (int i = 0; i < input.length; i++)
            avg = avg + input[i];
        int average = avg / input.length;
        System.out.println("The average value is " + average);
    }
}
