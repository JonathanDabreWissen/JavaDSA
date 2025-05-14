public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1,1,0,1,1,1};
        System.out.println(s.findMaxConsecutiveOnes(nums));
    }
}


class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int count = 0;
        int l = nums.length;

        for(int i = 0; i<l; i++){
            if( nums[i] == 0){
                if(count>=maxCount){
                    maxCount = count;
                }
                count = 0;
            }else{
                count++;
            }
        }

        if(count>maxCount){
            maxCount = count;
        }

        return maxCount;
    }
}

// Approach
// Take one maxCount variable and take one Count variable
// Since the array contains only 0's & 1's, whenever zero is encountered check if count>= maxCount
// if yes set maxCount = count
// Set count = 0; to start counting again.
// Since we compare count & maxCount when zero is encountered, after traversing the array, the last element may or may not be zero, so compare once again last time.
// return maxCount.

