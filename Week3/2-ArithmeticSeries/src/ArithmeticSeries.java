public class ArithmeticSeries {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k += i;
        }
        System.out.println(k);
    }
}
