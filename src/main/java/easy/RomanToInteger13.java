package easy;

import java.util.HashMap;

public class RomanToInteger13 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> rti = new HashMap<>();

        rti.put('I', 1);
        rti.put('V', 5);
        rti.put('X', 10);
        rti.put('L', 50);
        rti.put('C', 100);
        rti.put('D', 500);
        rti.put('M', 1000);

        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char nextChar = s.charAt(i + 1);

            if (rti.get(c) >= rti.get(nextChar)) {
                sum += rti.get(c);
                continue;
            }

            sum -= rti.get(c);
        }

        char c = s.charAt(s.length() - 1);
        sum += rti.get(c);

        return sum;
    }
}
