public class ImQuadraticSolver {
    public static void main( String[] args) {
        double Num1 = Double.parseDouble(args[0]);
        double Num2 = Double.parseDouble(args[1]);
        double Num3 = Double.parseDouble(args[2]);
        double discriminant = Math.pow(Num2, 2) - (4 * Num1 * Num3);
        if (Num1 == 0) {
            System.out.println(-Num2/Num3);
        } else if (discriminant >= 0) {
            System.out.println(((-Num2)+(Math.sqrt(discriminant)))/(2 * Num1));
            System.out.println(((-Num2)-(Math.sqrt(discriminant)))/(2 * Num1));
        } else if (discriminant < 0) {
            double helper = Math.sqrt(Math.abs(discriminant))/(2*Num1);
            System.out.println((-Num2/(2*Num1)) + " + " + helper + "i");
            System.out.println((-Num2/(2*Num1)) + " - " + helper + "i");
        }
    }
}
