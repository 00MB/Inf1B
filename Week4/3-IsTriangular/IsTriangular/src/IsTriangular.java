import java.util.Scanner;

public class IsTriangular {
    public static boolean isTri(double a, double b, double c) {
        if ((a >= 0 && b >= 0 && c >= 0) && (a < b && a < c) && (b < a && b < c) && (c < a && c < b)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        double a = stdIn.nextDouble();
        double b = stdIn.nextDouble();
        double c = stdIn.nextDouble();

        if (isTri(a, b, c)) {
            System.out.printf("%s, %s and %s could be the lenghts of a triangle\n", a, b, c);
        } else {
            System.out.println("Not a triangle.");
        }
        stdIn.close();
    }
}