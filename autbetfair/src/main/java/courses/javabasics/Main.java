package courses.javabasics;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        // define a constant
        final String FINAL_NAME = "Ion Popescu";

        int i =1;
        float fl = 5;
        double nr = 1.5;

        boolean isSelected = true;
        char c = 'a';
        String s = "a";

        System.out.println("Cont FILE_NAME=" + FINAL_NAME);

        s = "ana are mere";
        String d=" si prune";
        System.out.println(s + d);
        System.out.println("Suma=" + i + nr);
        System.out.println(s+i);
        System.out.println("Rest="+(fl%2));

        // conditions and increments
        int numar=1;
        numar=numar+1;

        if(numar==2) {
            System.out.println("Numarul este 2");
        }
        numar+=1;

        // postincrement
        System.out.println(numar++);
        // preincrement
        System.out.println(++numar);

        int secondNumber=11;
        boolean areEq=numar == secondNumber;
        System.out.println("The numbers are not equal: " + (!areEq));
        boolean notEq=numar != secondNumber;

        if(secondNumber>12) {
            System.out.println("Numar == 5 si secoundNumber<12");
        } else {
            System.out.println("Numar != 5 si secondNumber<12");
        }

        String letter="D";
        switch (letter) {
            case "A":
                System.out.println("apples");
                break;
            case "B":
                System.out.println("beer");
                break;
            case "D":
                System.out.println("drops");
                break;
            default:
                System.out.println("You have selected wrong option");
        }

        int nr2=12345678;
        int nrCifre = 0;

        while (nr2>0){
            nrCifre++;
            nr2 = nr2/10;
        }

        System.out.println("Nr cifre:" + nrCifre);

        int step=0;
        while(step<=10) {
            System.out.println(step);
            step++;
        }

        for(step=0; step<=10; step++){
            System.out.println(step);
        }

        System.out.println("Do while");
        int x1=11;

        do{
            System.out.println(x1);
        } while(x1<10);

        System.out.println("\nFor each in list");
        int[] numbers = {1,30, 50, 60, 70, 3, 5, 7, 9, 8};
        int nrPare=0;
        for(int num:numbers) {
            if(num%2==0)
                nrPare++;
        }
        System.out.println("Nr pare:" + nrPare);
    }
}
