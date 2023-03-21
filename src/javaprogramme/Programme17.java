package javaprogramme;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */

public class Programme17 {
    public static void main(String[] args) {
        int A[] = {50, 25, 2, 79, 18, 42};
        String name[] = {"Pinak", "Jimesh", "Nita", "Kirtana", "Neha", "Mamta"};
        System.out.println("Original numeric array : " + Arrays.toString(A));
        Arrays.sort(A);
        System.out.println("Sorted numeric array : " + Arrays.toString(A));
        System.out.println("Original string array : " + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sorted string array : " + Arrays.toString(name));
    }
}

