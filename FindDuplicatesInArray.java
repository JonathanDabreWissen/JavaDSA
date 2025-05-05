import java.util.*;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(s.findDuplicates(arr));
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> duplicateList = new ArrayList<>();

        for(int num: nums){
            int v = countMap.getOrDefault(num,0) + 1;
            if(v>1){
                duplicateList.add(num);
            }
            countMap.put(num, v);
        }   

        return duplicateList;
    }
}

//Approach
// Create a hashmap, called countMap.
// Traverse the array, get the count of each element from the countMap in variable v.
// If  v exceeds 1, then it's duplicate, add it to the duplicates array.