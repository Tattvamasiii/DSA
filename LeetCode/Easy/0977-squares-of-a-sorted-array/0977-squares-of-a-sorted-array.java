class Solution {
    public int[] sortedSquares(int[] nums) {
        int[]arr=new int[nums.length];
        int n=nums.length;
        
        
        int left = 0;
        int right = n - 1;
        int pos = n - 1;   // fill the result array from the back

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                arr[pos] = leftSq;
                left++;
            } else {
                arr[pos] = rightSq;
                right--;
            }
            pos--;
        }

        return arr;
        }
    }