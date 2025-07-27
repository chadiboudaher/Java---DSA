package twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // int[] result = twoSum(new int[]{1, 2, 3, 4, 5, 6, 7}, 9);
        // System.out.println(Arrays.toString(result));
        int[] nums = {1, 5, 7, -1, 5};
        int target = 6;
        System.out.println("Count of pairs: " + countPairs(nums, target));  // Output: 3
    }

    public static int[] twoSum(int[] nums, int target) {
        // create a hashmap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // calculate the complement 
            int complement = target - nums[i];

            // check if the complement is already in the map
            if (map.containsKey(complement)) {
                // if found, return the indices of the complement and the current number
                return new int[] { map.get(complement), i};
            }
            // Otherwise add the current number and its index to the map
            map.put(nums[i], i);
        }

        return new int[] {};
    }

    public static int countPairs(int[] nums, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = target - num;

            if (freq.containsKey(complement)) {
                count += freq.get(complement);
            }

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return count;
    }
}