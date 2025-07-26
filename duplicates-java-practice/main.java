import java.util.Arrays;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        // int[] nums = {2, 1, 3, 5, 3, 2};
        // int[] nums1 = {1, 2, 3, 2, 3, 4};
        int[] nums2 = {4,3,2,7,8,2,3,1};
        // System.out.println(firstDuplicates(nums)); 
        // System.out.println(totalDuplicates(nums1));
        System.out.println(Arrays.toString(allDuplicates(nums2)));
    }

    public static int firstDuplicates(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i])) {
                return nums[i];
            }
            hash.add(nums[i]);
        }
        return -1;
    }

    public static int totalDuplicates(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                dup.add(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }
        return dup.size();
    }

    public static int[] allDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                dup.add(nums[i]);
            } else {
                seen.add(nums[i]);
            }
        }
        int[] result = new int[dup.size()];
        int index = 0;
        for (int val : dup) {
            result[index++] = val;
        }
        return result;
    }
}
