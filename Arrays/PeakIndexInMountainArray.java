public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        Solution s = new Solution();

        // int arr [] = {1, 2, 3, 4, 5, 3, 2, 1};
        // int arr [] = {5, 4, 3, 2, 1};
        int arr [] = {1, 2, 3, 4, 5};

        System.out.println(s.peakIndexInMountainArray(arr));
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int i = 0;
        int j = arr.length -1;

        if(i == j){
            return i;
        }

        while ( (i!= j) && (arr[i]<= arr[i+1])){
            i++;
        }

        while ((i != j) && (arr[j]<=arr[j-1])){
            j--;
        }

        return i;
    }
}

//Approach
// Take the array take i = 0 & j as last index i.e. arr.length-1;
// Traverse the array in forward direction using i till the next element is not less than element at i. i.e. till arr[i]<arr[i+1] do i++
// Trevaers the array in backward direction using j till arr[j-1] < arr[j].
// Return i/j as you might have reached the peak element.