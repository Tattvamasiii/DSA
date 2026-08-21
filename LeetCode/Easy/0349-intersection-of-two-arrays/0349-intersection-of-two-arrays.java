class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
          HashMap<Integer, Integer> res= new HashMap<>();

        // Step 1: Collect all the elements
        for(int i=0; i<nums1.length;i++){
           int num= nums1[i];
           res.put(num, res.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> matches = new ArrayList<>(); // To Store the value
        // Step 2: Compare and see
        for(int i=0; i<nums2.length;i++) {
            int num = nums2[i];
            int compare = res.getOrDefault(num, 0);

             if (res.containsKey(num)) {   // still available?
            matches.add(num);
            res.remove(num);          // remove entirely, so it can't match again
        }
        }
            int[] ans = new int[matches.size()];
            for (int j = 0; j < ans.length; j++) {
                ans[j] = matches.get(j);
            }
            return ans;
    }
}
