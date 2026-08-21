class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count= new HashMap<>();

       // Pass 1 How many Character Appears
       for (int i = 0; i < s.length(); i++) {
           char c=s.charAt(i);
           // We will apply getOrDefault to refer to as a count.
           count.put(c,count.getOrDefault(c,0)+1);
       }
       // Pass 2 Find the first character with count ==1
       for (int i = 0; i < s.length(); i++) {
           char c=s.charAt(i);
           if(count.get(c)==1){
               return i;
           }
       }
       return -1;
    }
}