public class SearchRange {
    public static void main(String[] args) {
        Solution s = new Solution();

        
        int[] nums = {0, 1, 1, 1, 1, 1, 2, 3, 4, 4, 5} ;

        s.searchRange(nums, 4);

    }
}

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];

        int targetIndex = findTargetElement(0, nums.length-1, nums, target);
        System.out.println("Target index: " +targetIndex);

        if(targetIndex == -1){
            range[0] = -1;
            range[1] = -1;
        }
        else{
            range[0] = findRangeLowerLimit(targetIndex, nums, target);
            range[1] = findRangeUpperLimit(targetIndex, nums, target);
        }

        System.out.println("( " +range[0] +", " +range[1] +" )");
        return range;
    }

    private int findTargetElement(int s, int e, int[] nums, int target){

        if(s>e){
            return -1;
        }

        int m = s + ((e-s)/2);

        if(nums[m]==target){
            return m;
        }
        else if(nums[m]>target){
            e = m-1;
            return findTargetElement(s, e, nums, target);
        }
        else{
            s = m+1;
            return findTargetElement(s, e, nums, target);
        }
    }

    private int findRangeLowerLimit(int targetIndex, int[] nums, int target){
        if(targetIndex == 0){
            return 0;
        }
    
        int lower = -2;
        int index = targetIndex;
        while(index != -1){
            lower = index;
            int s = 0;
            int e = index -1;
            index = findTargetElement(s, e, nums, target);
        }

        return lower;
    }

    private int findRangeUpperLimit(int targetIndex, int[] nums, int target){
        if(targetIndex == nums.length-1){
            return targetIndex;
        }

        int upper = -2;
        int index = targetIndex;
        
        while (index != -1) {
            upper = index;
            int s = index + 1;
            int e = nums.length -1;
            index =  findTargetElement(s, e, nums, target);
        }

        return upper;
    }
}


//Approach
// Find target index using binary search
// Now find upper limit and lower limit using target index.
// We use two different functions to find lower and upper limit
// For lowerlimit, first we check whether targetIndex is 0, if yes return 0;
// if not we set a variable index = targetIndex-1, s= 0, e = index-1, and call the binarySearch function again. 
// We set lower = index, then store value of binarySearch function in index. We keep doing this until index = -1;
// Then return lower.
// For upperlimit, first we check whether targetIndex is nums.length-1, if yes return targetIndex.
// ifn not we set index = targetIndex + 1, s = index, e = nums.length-1 and call the binarySearch function.
// We set upper = index, then store the value of binarySearch function in index. We keep doing this until index = -1;
// Then return upper.