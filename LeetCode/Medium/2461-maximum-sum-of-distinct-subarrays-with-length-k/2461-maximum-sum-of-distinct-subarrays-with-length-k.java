class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n= nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        long sum=0;
      
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
         long maxSum = (map.size() == k) ? sum : 0;
        for (int i = k; i < n; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (i >= k) {
                int outgoing = nums[i - k];
                sum -= outgoing;
                map.put(outgoing, map.get(outgoing) - 1);
                if (map.get(outgoing) == 0) {
                    map.remove(outgoing);
                }
            }

            // Check window validity once it's of size k
            if (i >= k - 1 && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}