import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // int[] nums = {2, 1, 3, 5, 3, 2};
        // int[] nums1 = {1, 2, 3, 2, 3, 4};
        // int[] nums2 = {4,3,2,7,8,2,3,1};
        // int[] nums3 = {1, 2, 3, 2, 1};
        int[] nums4 = {1, 2, 3, 2, 1, 2};
        // System.out.println(firstDuplicates(nums)); 
        // System.out.println(totalDuplicates(nums1));
        // System.out.println(Arrays.toString(allDuplicates(nums2)));
        // System.out.println(Arrays.toString(duplicateIndices(nums3)));
        System.out.println(allidxOfEachDup(nums4));
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

    public static int[] duplicateIndices(int[] nums) {
        HashSet<Integer> dup = new HashSet<>();
        ArrayList<Integer> indices = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (indices.contains(nums[i])) {
                dup.add(i);
            } else {
                indices.add(nums[i]);
            }
        }

        int[] result = new int[dup.size()];
        int index = 0;
        for (int val : dup) {
            result[index++] = val;
        }
        return result;
    }

    public static Map<Integer, List<Integer>> allidxOfEachDup(int[] nums) {
        HashSet<Integer> seem = new HashSet<>();
        Map<Integer, List<Integer>> duplicatesMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (seem.contains(nums[i])) {
                if(!duplicatesMap.containsKey(nums[i])) {
                    duplicatesMap.put(nums[i], new ArrayList<>());
                    duplicatesMap.get(nums[i]).add(i);
                } else {
                    duplicatesMap.get(nums[i]).add(i);
                }
            } else {
                seem.add(nums[i]);
            }
        }
        return duplicatesMap;
    }

}
