class Solution {
    public void reverseString(char[] s) {
        int num=s.length;
       int left=0;
       int right=num-1;
       while(left<right){
           // Swap
           char temp= s[left];
           s[left]=s[right];
           s[right]=temp;
             left++;
             right--;
    }
}
}