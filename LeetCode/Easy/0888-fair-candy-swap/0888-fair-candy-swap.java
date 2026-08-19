class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int SumA=0;
     int SumB=0;
        for (int i = 0; i < aliceSizes.length; i++) {
        SumA+=aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            SumB+=bobSizes[i];
        }
        int maxVal = 0;
        for (int i : aliceSizes) {
            if (i > maxVal) maxVal = i;
        }
        for (int j : bobSizes) {
            if (j > maxVal) maxVal = j;
        }
        boolean[] seen = new boolean[maxVal + 1];
        for (int j : bobSizes) {
            seen[j] = true;
        }
        for (int x : aliceSizes) {
            int numerator = SumB - SumA + 2 * x;
            if (numerator % 2 == 0) {           // check divisible evenly (whole number)
                int y = numerator / 2;
                if (y >= 0 && y <= maxVal && seen[y]) {
                    return new int[]{x, y};
                }
            }
        }
        return new int[]{0};
    }
}