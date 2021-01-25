public class ArrayRotate {
    public static void main(String[] args) {
        int[] nums;
        nums = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            nums[i] = temp;
        }
        int[] copy;
        copy = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            if (i + 1 >= args.length) {
                copy[i] = nums[i + 1 - args.length];
            } else {
                copy[i] = nums[i+1];
            }
        }
        for (int i : copy) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
