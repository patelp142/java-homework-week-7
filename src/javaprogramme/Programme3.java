package javaprogramme;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and  English marks
 * (marks is between 0 to 100 and if it is out of range print error message
 * “Invalid  Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them
 * grade if %> = 80 A+,  %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * | Mark Sheet                    |
 * |_______________________________|
 * | Name : Jay                    |
 * | Roll No: 08                   |
 * |_______________________________|
 * | Subjects : Marks              |
 * |_______________________________|
 * | Math : 98                     |
 * | Science : 90                  |
 * | English : 85                  |
 * |_______________________________|
 * | Total : 273                   |
 * |_______________________________|
 * | Percentage : 91.0             |
 * | Result : Pass                 |
 * | Grade : A+                    |
 * |_______________________________|
 */

public class Programme3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = input.nextLine();                     //String declaration
        System.out.println("Enter student roll number");
        int rollno = input.nextInt();
        System.out.println("Enter marks of Maths");
        int marks1 = input.nextInt();
        if (marks1 > 100 || marks1 < 0) {
            System.out.println("Invalid  Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter marks of Science");
        int marks2 = input.nextInt();
        if (marks2 > 100 || marks2 < 0) {
            System.out.println("Invalid  Input, Marks should between 0 to 100");
            System.exit(0);
        }
        System.out.println("Enter marks of English");
        int marks3 = input.nextInt();
        if (marks3 > 100 || marks3 < 0) {
            System.out.println("Invalid  Input, Marks should between 0 to 100");
            System.exit(0);
        }
        input.close();

        System.out.println(" _______________________________ ");
        System.out.println("|                               |");
        System.out.println("|           Mark Sheet          |");
        System.out.println("|_______________________________|");
        System.out.println("|   Name        :     " + name + "     |");
        System.out.println("|   Roll no.    :     " + rollno + "         |");
        System.out.println("|_______________________________|");
        System.out.println("|   Subjects    :     Marks     |");
        System.out.println("|   Maths       :     " + marks1 + "        |");
        System.out.println("|   Science     :     " + marks2 + "        |");
        System.out.println("|   English     :     " + marks3 + "        |");
        System.out.println("|_______________________________|");
        int total = marks1 + marks2 + marks3;
        System.out.println("|   Total       :     " + total + "       |");
        System.out.println("|_______________________________|");
        float perc = total / 3;
        System.out.println("|   Percentage  :     " + perc + "%     |");

        if (perc < 35 || marks1 < 35 || marks2 < 35 || marks3 < 35) {
            System.out.println("|   Result      :     Fail      |");
        } else {
            System.out.println("|   Result      :     Pass      |");
        }

        if (perc >= 80) {
            System.out.println("|   Grade       :     A+        |");
        } else if (perc >= 60 && perc < 80) {
            System.out.println("|   Grade       :     A         |");
        } else if (perc >= 50 && perc < 60) {
            System.out.println("|   Grade       :     B         |");
        } else if (perc >= 35 && perc < 50) {
            System.out.println("|   Grade       :     C         |");
        } else {
            System.out.println("|   Grade       :     D         |");
        }
        System.out.println("|_______________________________|");

    }

}
