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

//

// 1 2 3 4 5 3 2 1
// --------|
//         |------

// 5 4 3 2 1
// |

// 1 2 3 4 5

// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14
// 1 2 3 4 5 6 7 8 9 8 7  6  4  2  1
// i             |                  j
//               i     |            j
//               i                  j