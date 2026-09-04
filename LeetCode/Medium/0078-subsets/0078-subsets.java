class Solution {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> list=new ArrayList<>();
        SubArray(new ArrayList<>(), nums, 0, list);
          return list;
    }
    static void SubArray( ArrayList<Integer> p, int[] nums, int index, List<List<Integer>> list){
        if (index == nums.length) {
            list.add(new ArrayList<>(p));
            return;
        }
        int ch = nums[index];
        // Take it
          p.add(ch);
        SubArray(p, nums, index + 1, list);
        // Backtrack
        p.remove(p.size() - 1);
         // Ignore it
        SubArray(p, nums, index + 1, list);
    }
    }
