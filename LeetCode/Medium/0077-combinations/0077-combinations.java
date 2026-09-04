class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
       result(new ArrayList<>(),1,n, k, list);
       return list;
    }
    static void result(ArrayList<Integer> p, int start, int n, int k, List<List<Integer>> list){
       // base case
       if(p.size()==k){
           list.add(new ArrayList<>(p));
           return;
       }
       for(int i=start; i<=n;i++){
           p.add(i); // choose one element
           result(p, i+1,n,k,list); // explore through recursion
           p.remove(p.size()-1); // backtracking
       }
    }
}