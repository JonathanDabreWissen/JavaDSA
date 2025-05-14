public class MoveZeroes {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {0,1,0,3,12};
        s.moveZeroes(nums);
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        int j = 0;
        for(int i = 0; i<l; i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(j<l){
            nums[j] = 0;
            j++;
        }

        for(int i = 0; i<l; i++){
            System.out.print(nums[i] + " ");
        }

    }
}

//Approach
// Use 2 pointers i & j
// Start both from zero
// Traverse the array using i, if found any non zero number add it to position j and increment j
// after completion of array using i. Complete the traversing using j and fill 0's
