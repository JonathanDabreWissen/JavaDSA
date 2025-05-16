public class SingleElementInSortedArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {3,3,7,7,10,11,11};
        System.out.println(s.singleNonDuplicate(nums));
    }
}

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = nums.length;
        if(l==1){
            return nums[0];
        }

        if(nums[0]!=nums[1]){
            return nums[0];
        }

        if(nums[l-1]!=nums[l-2]){
            return nums[l-1];
        }

        return findSingleElement(0, l-1, nums);
    }

    private int findSingleElement(int s, int e, int[] nums){
        int m = s + ((e-s)/2);

        if(nums[m] != nums[m-1] && nums[m] != nums[m+1]){
            return nums[m];
        }
        else if(m%2==0){
            if(nums[m] == nums[m+1]){
                s = m+1;
                return findSingleElement(s, e, nums);
            }
            else{
                e = m-1;
                return findSingleElement(s, e, nums);
            }
        }
        else{
            if(nums[m]==nums[m-1]){
                s = m+1;
                return findSingleElement(s, e, nums);
            }
            else{
                e = m-1;
                return findSingleElement(s, e, nums);
            }
        }
    }
}


// Approach
// Get length l of array first
// If l == 1, return nums[0];
// If not then we will move ahead.
// Check if Single element lies at the edge
// if(nums[0] != nums[1]) then return nums[0];
// if(nums[l-1] != nums[l-2] then return nums[l-1]);
// If not the above conditions then we move ahead with binary search approach.
// We will create a private function, pass it s, e and the array.
// Mid m will be calculated and checked against the rules mentioned below.
// Rules 
// m => m+1 or m-1 should be same if not return nums[m];
// If m is even(odd position)
// |__ if m+1 is same => s=m+1; if not e=m-1;
// If m is odd(even position)
// |__ if m-1 is same => s=m+1; if not e=m-1;