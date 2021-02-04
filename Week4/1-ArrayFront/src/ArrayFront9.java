public class ArrayFront9 {
    public static boolean arrayFront9(int[] nums) {
        boolean outcome = false;
        int i = 0;
        while (outcome == false && !(i == nums.length || i == 4)) {
            if (nums[i] == 9) {
                outcome = true;
                break;
            }
            i++;
        }
        return outcome;
    }
    public static void main(String[] args) {
        int N = args.length;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(args[i]);
        }
        System.out.println(arrayFront9(nums));
    }
}
