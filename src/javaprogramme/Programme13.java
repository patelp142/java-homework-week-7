package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program which input any number between 1 to 7 and
 * it print The Days  name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */

public class Programme13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int day = input.nextInt();
        System.out.println(getDayName(day));

        input.close();
    }

    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Invalid day range. Week contains 1 to 7 days";
        }
        return dayName;
    }
}
