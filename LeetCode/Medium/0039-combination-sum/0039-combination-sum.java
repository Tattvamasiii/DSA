class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr=new ArrayList<>();
       List<Integer> current= new ArrayList<>();
       backtrack(candidates, target, 0, current, arr);
       return arr;
    }
    static void backtrack(int[]candidates, int remaining, int start, List<Integer> current, List<List<Integer>> arr){
       if(remaining==0){
           arr.add(new ArrayList<>(current));
           return;
       }
       if(remaining<0){
           return;
       }
       for(int i=start; i<candidates.length;i++){
           current.add(candidates[i]);
           backtrack(candidates, remaining-candidates[i],i,current,arr);
           current.remove(current.size() - 1);
       }
         }
    }