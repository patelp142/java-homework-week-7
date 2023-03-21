package javaprogramme;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement.
 */

public class Programme9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                     //Scanner declaration
        System.out.println("Enter any alphabet from A to F");       //For user to read
        String letter = input.next();                               //User input data type

        input.close();                                              //Scanner closing
        switch (letter.toUpperCase()) {                             //Switch statement converting in upper if input in lowercase
            case "A":
                System.out.println("Your city name is Glasgow");
                break;
            case "B":
                System.out.println("Your city name is Edinburgh");
                break;
            case "C":
                System.out.println("Your city name is Aberdeen");
                break;
            case "D":
                System.out.println("Your city name is Inverness");
                break;
            case "E":
                System.out.println("Your city is Dundee");
                break;
            case "F":
                System.out.println("Your city is Sterling");
                break;
            default:                                                //For all other inputs
                System.out.println("Invalid input");
        }
    }
}
