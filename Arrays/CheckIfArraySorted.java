public class CheckIfArraySorted {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {2,1,3,4};
        System.out.println(s.check(nums));
    }
}
class Solution {
    public boolean check(int[] nums) {
        int l = nums.length;

        if(l==1){
            return true;
        }

        int i = 1;

        while(nums[i-1]<=nums[i]){
            i++;
            if(i>=l){
                return true;
            }
        }

        for(int j = 1; j<l; j++){
            if(nums[(i+j-1)%l]>nums[(i+j)%l]){
                return false;
            }
        }

        return true;
    }
}

// 0, 1, 2, 3, 4, 5, 6, 7, 8
// 1, 2, 3, 4, 5, 6, 7, 8, 9
// 9, 1, 2, 3, 4, 5, 6, 7, 8
// 8, 9, 1, 2, 3, 4, 5, 6, 7
// 7, 8, 9, 1, 2, 3, 4, 5, 6
// 6, 7, 8, 9, 1, 2, 3, 4, 5
//             i                j=1
// 
//             4+5-1 %9=> 8 
//             4+5   %9=> 0

//Approach
// It is expected that we should return true if array is sorted and rotated by 0>= places
// If single element array, return true straight forward.
// This means if the array is rotated r times, rotating it back by r will yield a sorted array.
// If we assume array is sorted and rotated, we try to find the point of rotation.
// To find the point of rotation we aim for the minimum element, how we do that is we start traversing the array
// We use i, we keep incrementing i till a situation comes where previous element is greater than the current
// Once we got the point where element at i is lesser than i-1, this is the point of deflection(minimum value), if the array was sorted. From here the array we if traverse in circular fashion using modulus, all the next elements should be greater than current.
// if the next element is less than the current element we return false.
// If we have completed the traversing distance of l, this means the array is sorted and we return true.