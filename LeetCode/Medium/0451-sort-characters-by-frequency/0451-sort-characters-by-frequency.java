class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int n=s.length();
        // Pass 1 where we need to count the values 
        for(int i=0; i<n; i++){
          char ch=s.charAt(i);
          map.put(ch, map.getOrDefault(ch, 0)+1);
        }
               StringBuilder ans = new StringBuilder();

        // Pass 2 Keep finding the character with the highest frequency
        while (!map.isEmpty()) {

            int maxCount = 0;
            char maxChar = ' ';

            // Find character with the highest frequency
            for (char ch : map.keySet()) {
                if (map.get(ch) > maxCount) {
                    maxCount = map.get(ch);
                    maxChar = ch;
                }
            }

            // Add that character maxCount times
            for (int i = 0; i < maxCount; i++) {
                ans.append(maxChar);
            }

            // Remove it so we don't select it again
            map.remove(maxChar);
        }

        return ans.toString();
      }
    }