import java.util.*;

public class FindDuplicatesInArray2 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(s.findDuplicates(arr));
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicatesList = new ArrayList<>();

        Arrays.sort(nums);

        int length = nums.length;

        for(int i = 1; i<length; i++){
            if(nums[i-1] != nums[i]){
                continue;
            }

            duplicatesList.add(nums[i]);
        }

        return duplicatesList;

    }
}

//Approach
// Sort the array,
// If length permits i.e length>=2, then start traversing from 2nd element.
// if prev element == current element, add it to the list of duplicates.
