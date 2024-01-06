package homeworks;

import java.util.Scanner;

public class LeapYear {

    protected int x;

    public LeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a year between 1900-2016: ");
        this.x = input.nextInt();
    }

    public void displayNrDays() {
        if(isLeap()) System.out.println("\nProblem 3 - The year " + x + " has " + 29 + " days");
        else System.out.println("\nProblem 3 - The year " + x + " has " + 28 + " days");
    }

    public boolean isLeap() {

        if ( (x%4 == 0 && x%100 != 0) || (x%100 == 0 && x%400 != 0)) return true;

        return false;

    }
}
