public class SaferQuadraticSolver {
    public static void main( String[] args) {
        double Num1 = Double.parseDouble(args[0]);
        double Num2 = Double.parseDouble(args[1]);
        double Num3 = Double.parseDouble(args[2]);
        double helper = Math.pow(Num2, 2) - (4 * Num1 * Num3);
        if (Num1 == 0) {
            System.out.println("A = 0. Cannot solve equation.");
        } else if (helper >= 0) {
            System.out.println(((0-Num2)+(Math.sqrt(helper)))/(2 * Num1));
            System.out.println(((0-Num2)-(Math.sqrt(helper)))/(2 * Num1));
        } else if (helper < 0) {
            System.out.println("Equation is not solvable for real x.");
        }
    }
}
