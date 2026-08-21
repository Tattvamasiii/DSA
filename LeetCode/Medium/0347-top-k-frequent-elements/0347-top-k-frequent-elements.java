class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> res=new HashMap<>();

        //Step 1: Collect the num and it's freq
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            res.put(num ,res.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> matches = new ArrayList<>();
        // Step 2: Check number of freq
         List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(res.entrySet());
    entryList.sort((a, b) -> b.getValue() - a.getValue());

    // Step 3: take top k keys
    int[] ans = new int[k];
    for (int i = 0; i < k; i++) {
        ans[i] = entryList.get(i).getKey();
    }
    return ans;
        }
    }