class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums); // [-4,-1,-1,0,1,2]

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Remove Duplicates

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    // Sweep
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                }
            }
        }
        return list;
    }
}