class Solution {
    public List<String> generateParenthesis(int n) {
            List<String> list=new ArrayList<>();

           result("",0,0,n,list);
           return list;
    }
     void result(String p,int open, int close, int n, List<String> list){

        // Base case
        if (p.length() == 2 * n) {
            list.add(p);
            return;
        }

        // Add '('
        if (open < n) {
            result(p + "(", open + 1, close, n, list);
        }

        // Add ')'
        if(close<open){
            result(p+ ")",open,close+1,n, list);
        }
    }
}