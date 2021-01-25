public class QuadraticSolver {
    public static void main( String[] args) {
        double Num1 = Double.parseDouble(args[0]);
        double Num2 = Double.parseDouble(args[1]);
        double Num3 = Double.parseDouble(args[2]);
        double helper = Math.pow(Num2, 2) - (4 * Num1 * Num3);
        if (helper >= 0) {
            System.out.println(((-Num2)+(Math.sqrt(helper)))/(2 * Num1));
            System.out.println(((-Num2)-(Math.sqrt(helper)))/(2 * Num1));
        }
    }
}
