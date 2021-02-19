public class NoTriples {
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums[i] == nums[i+1] && nums[i] == nums[i+2]) {
                return false;
            }
        }
        return true;
    }
}
