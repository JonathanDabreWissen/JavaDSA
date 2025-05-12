public class RotateArray {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        s.rotate(nums, 4);
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int r = k%l;

        int nums2[] = new int[l];

        int i = l - r;

        for(int j =0; j<l; j++ ){
            nums2[j] = nums[i];  
            i = (i+1)%l;
        }

        for(int j = 0; j<l; j++){
            nums[j] = nums2[j];
        }
    }
}

//
// 1 2 3 4 5 6 7 - 0 Places Rotated
// 7 1 2 3 4 5 6 - 1 Place Rotated
// 6 7 1 2 3 4 5 - 2 Places Rotated
// 5 6 7 1 2 3 4 - 3 Places Rotated
// 4 5 6 7 1 2 3 - 4 Places Rotated
// 3 4 5 6 7 1 2 - 5 Places Rotated
// 2 3 4 5 6 7 1 - 6 Places Rotated
// 1 2 3 4 5 6 7 - 7 Places Rotated
// int l = nums.length
// int r = k%l;
// 1 2 3 4 5 6 7 => 5 6 7 1 2 3 4
//

//Appraoch
// Rotating array from right side
// Rotating the array with number of places equal to its length results in same array
// So we first check the given k by doing its modulo with length.
// If it results r with 0, we straight forward return.
// If not, we move further with our process
// We take another array of same length. 
// We start traversing the original array from l-r position. Starting from there and using modulo we traverse the entire length l.
// While traversing the original we store the value in the new array starting from 0 position.
// At the end we rewrite the new array in the original array and return.



