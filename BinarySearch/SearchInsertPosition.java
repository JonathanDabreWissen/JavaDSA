// package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(s.searchInsert(nums, 8));
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(0, nums.length-1, nums, target);
    }

    private int binarySearch(int s, int e, int[] nums, int target){
        if(s>e){
            return s;
        }

        int m = s + ((e-s)/2);

        if(nums[m] == target){
            return m;
        }
        else if(nums[m]>target){
            e = m-1;
            return binarySearch(s, e, nums, target);
        }
        else{
            s = m+1;
            return binarySearch(s, e, nums, target);
        }
    }
}

// 0 1 2 3 4 5 
//-1,0,3,5,9,12 => 2
// m = 0 + 5 / 2 => 2 => s = 0, e = 1;
// m = 0 + 1 / 2 => 0 => s = 1, e = 1;
// m = 1 + 1 / 2 => 1 => s = 2, e = 1;

//Approach
// Sorted array is given
// Build a Private recursive function to be called
// The function will take start point s & end point e.
// We will calculate mid, using m = s + ((e-s)/2), so that it doesn't go out of integer limit.
// Check if the number pointed by mid m is the target element or not.
// if yes, return m;
// If not, check if it's greater than the target element, if yes bring end pointer to m-1;
// If its smaller than the target element, bring start pointer to m+1
// If at any call s>e, then return s; Element is thus can be added at this position.