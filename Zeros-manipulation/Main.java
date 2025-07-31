import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 0, 3};
        zerosToFront(nums);

    }
    public static void zerosToFront(int[] nums) {
        int prefix = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[prefix--] = nums[i];
            }
        }

        while (prefix >= 0) {
            nums[prefix--] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}