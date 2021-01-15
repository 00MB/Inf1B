public class Distance1 {
    public static void main( String[] args ) {
        int Num1 = Integer.parseInt( args[0]);
        int Num2 = Integer.parseInt( args[1]);
        System.out.println(Math.max(Num1, Num2) - Math.min(Num1, Num2));
    }
}
