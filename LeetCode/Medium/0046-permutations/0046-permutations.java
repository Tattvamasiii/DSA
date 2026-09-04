
class Solution {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();

        // Start recursion from index 0
        SubPermu(nums, 0, list);

        return list;
    }

    static void SubPermu(int[] nums, int index, List<List<Integer>> list) {

        // Base case
        if (index == nums.length) {

            // Convert int[] to List<Integer>
            List<Integer> temp = new ArrayList<>();

            for (int num : nums) {
                temp.add(num);
            }

            list.add(temp);
            return;
        }

        // Try every element from index onwards
        for (int i = index; i < nums.length; i++) {

            // 1. CHOOSE
            swap(nums, index, i);

            // 2. EXPLORE
            SubPermu(nums, index + 1, list);

            // 3. BACKTRACK
            swap(nums, index, i);
        }
    }

    static void swap(int[] nums, int a, int b) {

        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}

