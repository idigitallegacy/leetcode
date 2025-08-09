package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> indexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indexes.get(nums[i]) != null) {
                ArrayList<Integer> values = indexes.get(nums[i]);

                values.add(i);
                indexes.put(nums[i], values);
            } else {
                ArrayList<Integer> values = new ArrayList<>();

                values.add(i);
                indexes.put(nums[i], values);
            }
        }
        int[] sorted = Arrays.stream(nums).sorted().toArray();

        int left = 0;
        int right = sorted.length - 1;

        while (sorted[left] + sorted[right] != target) {
            if (sorted[left] + sorted[right] > target) {
                right--;
                continue;
            }

            left++;
        }

        if (sorted[left] == sorted[right]) {
            ArrayList<Integer> values = indexes.get(sorted[left]);

            return new int[]{values.get(0), values.get(1)};
        }

        return new int[]{indexes.get(sorted[left]).getFirst(), indexes.get(sorted[right]).getFirst()};
    }
}
