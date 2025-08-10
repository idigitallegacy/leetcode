package easy;

import java.util.Map;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[right] <= target) {
            return nums[right] < target ? right + 1 : right;
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
                continue;
            }

            right = mid - 1;
        }

        if (nums[left] < target) {
            return left + 1;
        }

        return left;
    }
}
