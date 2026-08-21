class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n = nums.length;
    int[][] pairs = new int[n][2]; // each row: {value, originalIndex}
    for (int i = 0; i < n; i++) {
        pairs[i][0] = nums[i];
        pairs[i][1] = i;
    }

    // sort pairs by value (column 0), using insertion sort adapted for pairs
    for (int i = 0; i < pairs.length - 1; i++) {
        for (int j = i + 1; j > 0; j--) {
            if (pairs[j][0] < pairs[j - 1][0]) {
                int[] temp = pairs[j];
                pairs[j] = pairs[j - 1];
                pairs[j - 1] = temp;
            } else {
                break;
            }
        }
    }

    int left = 0, right = n - 1;
    while (left < right) {
        int sum = pairs[left][0] + pairs[right][0];
        if (sum == target) {
            return new int[]{pairs[left][1], pairs[right][1]};
        } else if (sum > target) {
            right--;
        } else {
            left++;
        }
    }
    return new int[]{-1, -1};
    }
}