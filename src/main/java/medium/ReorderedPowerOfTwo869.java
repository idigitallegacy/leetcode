package medium;

import java.util.*;

public class ReorderedPowerOfTwo869 {
    public boolean reorderedPowerOf2(int n) {
        if (Integer.bitCount(n) == 1 && n > 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        double powerOf2 = 0;

        int nHash = hash(String.valueOf(n));
        int powerHash = hash(String.valueOf(powerOf2));

        for (int power = 0; powerOf2 <= 1e9 && powerHash != nHash; powerOf2 = Math.pow(2, power++)) {
            powerHash = hash(String.valueOf((int) powerOf2));
        }


        return powerHash == nHash;
    }

    private int hash(String s) {
        int primaryNumber = 28657;

        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);


        double hash = 0;
        for (int i = 0; i < sortedString.length(); i++) {
            hash += sortedString.charAt(i) * Math.pow(primaryNumber, i) % 9851;
        }

        return (int) hash;
    }
}
