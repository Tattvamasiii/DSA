class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
         HashMap<Character, Integer> supply=new HashMap<>();

        // Step 1: count the letters available in Magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c= magazine.charAt(i);
            supply.put(c, supply.getOrDefault(c,0)+1);
        }

        // Step 2:- count the letters available in RansomNote
        for (int i = 0; i < ransomNote.length(); i++) {
            char c=ransomNote.charAt(i);
            int available =supply.getOrDefault(c,0);

            if(available==0){
                return false;
            }
            supply.put(c,available-1);
        }
        return true;
    }
}