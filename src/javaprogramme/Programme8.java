package javaprogramme;

import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly
 * (use if else) if  any other alphabet should be invalid entry
 */

public class Programme8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F");
        String city = input.next();
        input.close();

        if (city.equals("A")) {
            System.out.println("Glasgow");
        } else if (city.equals("B")) {
            System.out.println("Edinburgh");
        } else if (city.equals("C")) {
            System.out.println("Aberdeen");
        } else if (city.equals("D")) {
            System.out.println("Inverness");
        } else if (city.equals("E")) {
            System.out.println("Dundee");
        } else if (city.equals("F")) {
            System.out.println("Sterling");
        } else {
            System.out.println("Invalid city input");
        }
    }
}
