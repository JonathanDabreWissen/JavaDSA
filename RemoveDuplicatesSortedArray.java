class RemoveDuplicatesSortedArray{
    public static void main(String args[]){
        Solution s = new Solution();

        int nums[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(s.removeDuplicates(nums));

    }
}

class Solution {
    public int removeDuplicates(int[] nums) {

        int l = nums.length;
        int i = 0;
        int j = 0;

        while(j<l){
            if(nums[j]>nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;  
    }
}

//Approach
// Use two pointer approach
// Start i & j from 0;
// Start iterating j till it's less array length
// While traversing check if nums[j] is greater than nums[i], if so increment i and do nums[i] = nums[j];
// At the end return i+1;
