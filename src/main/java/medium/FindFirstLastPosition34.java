package src.main.java.medium;
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FindFirstLastPosition34 {
    public static void main(String[] args) {
            int[] nums = new int[] {5, 7, 7, 8, 10};
            int target = 8;
            int[] response = searchRange(nums, target);
            for(int i : response) {
                System.out.print(i + " ");
            }

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[] {-1, -1};
        if (nums.length == 0) {
            return result;
        }
        if (nums[0] > target || nums[nums.length - 1] < target) {
            return result;
        }
        boolean start = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && !start) {
                result[0] = i;
                result[1] = i;
                start = true;
                continue;
            }
            if (nums[i] == target && start) {
                result[1] = i;
            }
        }
        return result;
    }
}
