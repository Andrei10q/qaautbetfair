package homeworks;

public class PrimeNumbers {

    public static void displayPrimeNumbers(int n) {
        int j = 1;

        System.out.println("\nProblem 2 - all the prime numbers lower than " + n + " are: ");

        while(j <= n) {
            if (countDivisors(j) == 2) System.out.println(j);
            j++;
        }
    }

    public static int countDivisors(int x) {
        int i = 2;
        int numberDivisors = 1;

        while(i <= x) {
            if (x % i == 0) numberDivisors++;

            if (numberDivisors > 2) break;

            i++;
        }
        return numberDivisors;
    }
}
