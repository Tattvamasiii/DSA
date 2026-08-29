class Solution {
    public boolean isPalindrome(String s) {
         // remove the Punctuation, Space, Capitalization

        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }if (!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            // compare the char
            if(Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}