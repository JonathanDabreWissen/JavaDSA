public class FindSingleNumber {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {4,1,2,1,2};
        System.out.println(s.singleNumber(nums));
    }   
}

class Solution {
    public int singleNumber(int[] nums) {
        int calculatedValue = 0;
        
        for(int num: nums){
            calculatedValue = calculatedValue^num;
        }

        return calculatedValue;
    }
}   

//Approach
// Use Bitwise XOR operation
// XOR Rule is a^0 => a & a^a => 0
// XOR operation is commutative 
// Since in the array there all numbers appearing twice except one, if we do XOR operation on all the elements, the elements appearing twice will cancel out each resulting in 0 and that single element will get XORed with 0 and result in that same number.
// We start with a calculatedValue = 0;
// We XOR it with all the elements.
// We return the calculatedValue, that's our answer.
