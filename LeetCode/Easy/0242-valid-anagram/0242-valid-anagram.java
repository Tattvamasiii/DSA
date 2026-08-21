class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
           return false;
       }

       HashMap<Character, Integer> res=new HashMap<>();

        // Step 1: Collect the no of variables of String s
        for(int i=0; i<s.length();i++){
            char ch=s.charAt(i);
            res.put(ch,res.getOrDefault(ch, 0)+1);
        }
        // Step 2:- Compare and see
        for (int i=0; i<t.length();i++){
            char ch=t.charAt(i);
           int compare=res.getOrDefault(ch,0);

           if(compare==0){
               return false;
           }
             res.put(ch,compare-1);
        }
        return true;
    }
    }