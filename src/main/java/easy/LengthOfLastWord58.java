package easy;

public class LengthOfLastWord58 {
    public int lengthOfLastWord(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int lastCharPosition = s.length() - 1;

        while (s.charAt(lastCharPosition) == ' ') {
            --lastCharPosition;
        }

        int length = 0;

        for (int lastSpacePosition = lastCharPosition; lastSpacePosition >= 0 && s.charAt(lastSpacePosition) != ' '; --lastSpacePosition) {
            ++length;
        }

        return length;
    }
}
