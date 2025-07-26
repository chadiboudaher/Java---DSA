import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 5, 3, 2};
        System.out.println(firstDuplicates(nums)); 

    }

    public static int firstDuplicates(int[] nums) {
        HashSet hash = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i])) {
                return nums[i];
            }
            hash.add(nums[i]);
        }
        return -1;
    }
}
