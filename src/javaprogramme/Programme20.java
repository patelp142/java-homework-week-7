package javaprogramme;

/**
 * 20. Write a Java program to test if an array contains a specific value.
 */

public class Programme20 {
    public static void main(String[] args) {

        int[] value = {78, 45, 12, 56, 89};         // Array declaration
        int toFind = 45;
        boolean found = false;

        for (int n : value) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");
    }

}
