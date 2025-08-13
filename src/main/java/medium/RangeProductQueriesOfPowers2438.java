package medium;

import java.util.ArrayList;

public class RangeProductQueriesOfPowers2438 {
    private final Double modulo = Math.pow(10, 9) + 7;

    public int[] productQueries(int n, int[][] queries) {
        Double[] powers = this.getPowers(n);
        int[] answers = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            double product = powers[left];

            for (int j = left + 1; j <= right; j++) {
                product *= powers[j];
            }

            answers[i] = (int) (product % this.modulo);
        }

        return answers;
    }

    private Double[] getPowers(int n) {
        ArrayList<Double> powers = new ArrayList<>();

        double power = Math.floor(Math.log(n) / Math.log(2));
        double powersSum = 0;

        while (powersSum < n && power >= 0) {
            double product = Math.pow(2, power);
            powersSum += product;
            powers.add(product);

            power = Math.floor(Math.log(n - powersSum) / Math.log(2));
        }

        return powers.reversed().toArray(Double[]::new);
    }
}
