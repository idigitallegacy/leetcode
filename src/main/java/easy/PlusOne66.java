package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlusOne66 {
    public int[] plusOne(int[] digits) {
        int pos = digits.length - 1;
        ++digits[pos];

        while (pos > 0 && digits[pos] > 9) {
            digits[pos] = digits[pos] - 10;
            ++digits[pos - 1];
            --pos;
        }

        if (pos == 0 && digits[pos] > 9) {
            digits[pos] = digits[pos] - 10;
            int[] copy = new int[digits.length + 1];
            System.arraycopy(digits, 0, copy, 1, digits.length);
            copy[0] = 1;

            return copy;
        }

        return digits;
    }
}
