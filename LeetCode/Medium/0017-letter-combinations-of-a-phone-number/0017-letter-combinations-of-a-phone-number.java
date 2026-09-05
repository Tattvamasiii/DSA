class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<>();
        if (digits.length() == 0) {
            return list;
        }
        result("", digits, list);
        return list;
   }
    void result(String p, String up, List<String> list) {
        // Base case
         if (up.isEmpty()) {
             list.add(p);
             return;
         }

        // Take the first digit from up
        char digit = up.charAt(0);

        // Convert digit into its corresponding letters
        String letters = getLetters(digit);

        // Remaining digits
        String remaining = up.substring(1);

        // Choose one letter at a time
        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            // Choose
            result(p + ch, remaining, list);
        }
    }
    String getLetters(char digit) {
        if (digit == '2')
            return "abc";
        if (digit == '3')
            return "def";
        if (digit == '4')
            return "ghi";
        if (digit == '5')
            return "jkl";
        if (digit == '6')
            return "mno";
        if (digit == '7')
            return "pqrs";
        if (digit == '8')
            return "tuv";
        if (digit == '9')
            return "wxyz";

        return "";
    }
    }