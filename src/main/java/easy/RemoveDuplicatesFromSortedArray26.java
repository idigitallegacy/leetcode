package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        int current_index = 0;

        while (current_index < nums.length) {
            int num = nums[current_index];
            answer.add(num);

            int repeated_index = current_index;

            while (repeated_index < nums.length && nums[repeated_index] == num) {
                ++repeated_index;
            }

            current_index = repeated_index;
        }

        for (int i = 0; i < answer.size(); i++) {
            nums[i] = answer.get(i);
        }

        return answer.size();
    }
}
