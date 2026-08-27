class Solution {
    public int majorityElement(int[] nums) {
           HashMap<Integer, Integer> map=new HashMap<>();
       int n=nums.length;

       // Pass 1 How many Character Appears
       for (int i = 0; i <n ; i++) {
           int temp=nums[i];
           map.put(temp,map.getOrDefault(temp,0)+1);
       }

       // Pass 2 Find the character with count as highest
       int maxCount=0;
       int maxElement=0;
       for (int i = 0; i < n; i++) {
           int temp=nums[i];
           if(map.get(temp)>maxCount){
               maxCount=map.get(temp);
               maxElement=temp;
           }
       }
       return maxElement;
    }
    }

