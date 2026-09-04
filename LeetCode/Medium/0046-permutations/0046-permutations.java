// This doesn't uses Backtracking !!!!

class Solution {
    public List<List<Integer>> permute(int[] nums) {
              List<List<Integer>> list = new ArrayList<>();
        SubPermu(new ArrayList<>(), nums, 0, list);
        return list;
    }

    static void SubPermu(ArrayList<Integer> p, int[] nums, int index, List<List<Integer>> list) {
        if (index == nums.length) {
            list.add(new ArrayList<>(p));
            return;
        }
        int ch = nums[index];
        ArrayList<Integer> ans = new ArrayList<>(); // Save it in answer whatever indiviual recusion call is getting
        for (int i = 0; i <= p.size(); i++) {
            List<Integer>  f = p.subList(0, i);
            List<Integer>  s = p.subList(i, p.size());

            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(f);
            temp.add(ch);
            temp.addAll(s);
            SubPermu(temp, nums, index + 1, list );
    }
}
}
