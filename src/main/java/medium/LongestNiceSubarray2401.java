package medium;

public class LongestNiceSubarray2401 {
    public int longestNiceSubarray(int[] nums) {
        if (nums.length == 0) return 1;

        int left = 0;
        int right = 0;
        int longestNiceSubarrayLength = 1;

        while (right < nums.length) {
            int niceSubarrayLength = 0;
            int niceSubarrayBitmap = 0;

            while (right < nums.length && (niceSubarrayBitmap & nums[right]) == 0) {
                niceSubarrayBitmap = niceSubarrayBitmap | nums[right];
                ++niceSubarrayLength;
                ++right;
            }

            if (niceSubarrayLength > longestNiceSubarrayLength) {
                longestNiceSubarrayLength = niceSubarrayLength;
            }

            ++left;
            right = left;
        }

        return longestNiceSubarrayLength;
    }
}
