class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
           double result;
       int []merged_Array = merge(nums1, nums2);
        // for odd length
        int n=merged_Array.length;
        if(n%2!=0) {
            result = merged_Array[n / 2];
        }else{
            // for even length
          result= ((double) merged_Array[n/2] + (double) merged_Array[n/2-1])/2;
        }

         return result;
    }
    static int[] merge(int [] first, int [] second){
        int[] mix=new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k]= first[i];
                i++;
            }else{
                mix[k]= second[j];
                j++;
            }
            k++;
        }
        // it may be possible one of the array may not be complete
        // copy the remaining elements in the last
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j < second.length){
            mix[k]= second[j];
            j++;
            k++;
        }
        return mix;
    }
    }