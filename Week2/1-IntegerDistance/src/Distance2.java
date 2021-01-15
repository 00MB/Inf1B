public class Distance2 {
    public static void main( String[] args) {
        int Num1 = Integer.parseInt( args[0]);
        int Num2 = Integer.parseInt( args[1]);
        if (Num1 - Num2 > 0) {
            System.out.println(Num1 - Num2);
        } else {
            System.out.println(Math.abs(Num1 - Num2));
        }
    }
}
