public class PeakIndexInMountainArray2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {1, 2, 3, 4, 5, 3, 1, 0, -1, -2, -3};
        System.out.println(s.peakIndexInMountainArray(arr));
    }
}

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        return getPeakElement(arr, i, j);
    }

    int getPeakElement(int[] arr, int i, int j){
        int m = j - ((j-i)/2);
        // System.out.println(i + ", " +j +", " + m);
        //Check if peak element
        if(arr[m]>arr[m-1] && arr[m]>arr[m+1]){
            return m;
        }
        else{
            if(arr[m+1] > arr[m]){
                i = m;
                return getPeakElement(arr, i, j);
            }
            else{
                j = m;
                return getPeakElement(arr, i, j);
            }
        }
    }
}
//Approach
// 0  1  2  3  4  5  6  7   8   9   10
// 1, 2, 3, 4, 5, 3, 1, 0, -1, -2, -3
// Create a recursive function, which takes array, i & j
// Find mid index 
// Check if element at mid index is highest or not. (arr[m]> arr[m-1] && arr[m]> arr[m-1]), if yes return m;
// if m is not the highest
// We check if next element bigger than the element at m, (arr[m+1]>arr[m]),
// if yes we reassign i = m and return the function call.
// else reassign j = m and return the function call.