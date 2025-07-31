import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // int[] nums = {1, 0, 2, 0, 3};
        // zerosToFront(nums);
        // int[] nums = {1, -2, 3, -1, -3, -4, 5};
        // System.out.println(Arrays.toString(negativeToEnd(nums)));
        // int[] nums = {3, 2, 2, 3};
        // System.out.println(removeDuplicate(nums, 3));
        // int[] nums = {0, 1, 1, 0, 1};
        // System.out.println(Arrays.toString(zerosAndOne(nums)));
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(dutchNatinalFlag(nums)));

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
            if (nums[i] != target) {
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

    public static int[] zerosAndOne(int[] nums) {
        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) {
                int temp = nums[i];
                nums[i] = nums[prefix];
                nums[prefix] = temp;
                prefix++;
            }
        }

        return nums;
    }

    public static int[] dutchNatinalFlag(int[] nums) {
        int pre_1 = 0;
        int pre_2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 2) {
                int temp = nums[i];
                nums[i] = nums[pre_1];
                nums[pre_1] = temp;
                pre_1++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[pre_2];
                nums[pre_2] = temp;
                pre_2++;
            }
        }
        return nums;
    }
}