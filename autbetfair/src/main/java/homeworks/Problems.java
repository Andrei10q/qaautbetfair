package homeworks;

import homeworks.SumOfNumbers;
import homeworks.PrimeNumbers;
import homeworks.LeapYear;

public class Problems {

    public static void main(String[] args) {

        SumOfNumbers p1 = new SumOfNumbers();
        System.out.println("\nProblem 1 - Sum of first 100 numbers greater than 0 is : " + p1.sumNumbers());

        PrimeNumbers.displayPrimeNumbers(1000000);

        LeapYear p3 = new LeapYear();
        p3.displayNrDays();
    }
}
