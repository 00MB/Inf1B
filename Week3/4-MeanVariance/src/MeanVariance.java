public class MeanVariance {
    public static void main(String[] args) {
        double[] nums;
        nums = new double[args.length];
        double mean = 0.0;
        for (int i = 0; i < args.length; i++) {
            double temp = Double.parseDouble(args[i]);
            nums[i] = temp;
            mean += temp;
        }
        System.out.println(mean/nums.length);
        double variance = 0.0;
        for (int i=0; i < args.length; i++) {
            double temp = nums[i];
            variance += Math.pow((temp - (mean/nums.length)),2);
        }
        System.out.println(variance/nums.length);
    }
}
