package easy;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        List<Integer> answer = new ArrayList<>();
        int current_index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                answer.add(nums[i]);
            }
        }

        for (int i = 0; i < answer.size(); i++) {
            nums[i] = answer.get(i);
        }

        return answer.size();
    }
}
