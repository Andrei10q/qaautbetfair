package courses.javabasics;

public class Draw {

    public static void main(String[] args) {
        System.out.println("Param 1:" + args[0] + "\nParam 2:" + args[1]);
        drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        // drawFullShape(3,4);
        System.out.println("Draw same size shape");
        drawFullShape(3);
        System.out.println("Draw same size as string");
        drawFullShape("3");
        drawLine(4);
    }

    public static void drawLine(int m){
        for(int j = 0; j < m; j++) {
            System.out.print("*");
        }
        System.out.println("*");
    }

    public static void drawFullShape(int n, int m) {
        // implement method
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1)
                    System.out.println("*");
                else
                    System.out.print("*");
            }
        }
    }

    public static void drawFullShape(int n) {
        drawFullShape(n, n);
    }

    public static void drawFullShape(String n, String m) {
        drawFullShape(Integer.parseInt(n), Integer.parseInt(m));
    }

    public static void drawFullShape(String n) {
        drawFullShape(Integer.parseInt(n));
    }

}
