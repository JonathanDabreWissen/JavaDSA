public class MissingNumber {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {3,0,1};
        System.out.println(s.missingNumber(nums));
    }
}


class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = (n*(n+1))/2;

        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += nums[i];
        }

        return expectedSum - sum;
    }
}


//Approach
// The given array of length n contains all the numbers in range (0 to n) except one.
// so we take a sum first n natural numbers.
// We then take sum of all the numbers in the array.
// If array contains all the first n natural numbers except one in that range, the array sum will not have included in the sum.
// Therefore we return the expectedSum - sumCalculated, the result is the number which was missing.
