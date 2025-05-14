public class RotateArray2 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int nums[] = {1,2,3,4,5,6,7};

        s.rotate(nums, 3);
    }
}

class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k%l; //3
        
        int j = l-1; 
        for(int i = 0; i<l/2;  i++){
            int t = nums[i];
            nums[i]=nums[j];
            nums[j] = t;
            j--;
        }

        for(int i = 0; i<l; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();

        j = k-1;
        for(int i = 0; i<k/2; i++){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            j--;
        }

        for(int i = 0; i<l; i++){
            System.out.print(nums[i] +" ");
        }
        System.out.println();

        j = l-1;
        int m = (k+l-1)/2;
        for(int i = k; i<=m; i++){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
            j--;
        }

        for(int i = 0; i<l; i++){
            System.out.print(nums[i] +" ");
        }

    }
}

// 
//Approach
// Reverse the entire array first
// Then reverse first k elements
// Then reverse from k+1 to last element
