import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] nums = {1, 0, 2, 0, 3};
        // zerosToFront(nums);
        // int[] nums = {1, -2, 3, -1, -3, -4, 5};
        // System.out.println(Arrays.toString(negativeToEnd(nums)));
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeDuplicate(nums, 3));

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

    public static int[] negativeToEnd(int[] nums) {
        int prefix = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                int temp = nums[i];
                nums[i] = nums[prefix];
                nums[prefix] = temp;
                prefix++;
            }
        }
        return nums;
    }

    public static int removeDuplicate(int[] nums, int target) {
        int prefix = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 3) {
                int temp = nums[i];
                nums[i] = nums[prefix];
                nums[prefix] = temp;
                prefix++;
            } else {
                count++;
            }
        }
        return nums.length - count;
    }
}