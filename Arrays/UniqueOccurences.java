import java.util.HashMap;

public class UniqueOccurences {
    public static void main(String[] args) {
        Solution s = new Solution();
        int arr[] = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(s.uniqueOccurrences(arr));
    }
}

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> countMap = new HashMap<>();

        int l = arr.length;
        for(int i = 0; i<l;  i++){
            int v = countMap.getOrDefault(arr[i], 0);
            countMap.put(arr[i], ++v);
        }

        HashMap<Integer, Integer> uniquenessMap = new HashMap<>();

        for(Integer value : countMap.values()){
            if(uniquenessMap.containsKey(value)){
                return false;
            }
            else {
                uniquenessMap.put(value, 1);
            }
        }

        return true;
    }
}

//Appraoch:
// We will take 2 hashmaps to solve this problem.
// First hashmap called countMap, this hashmap will record how many times an element as appeared in the input array.
// Once the countMap is prepared, now we will check  if the count is unique.
// To see if the count is unique, we will map the values of the countMap as keys in another hashmap called uniquenessMap.
// Before putting the value(counts) as key in the uniqueness map, we will check if the key already exist, if it does, we will straight forward return false.
// If all values(counts) get mapped in the uniquenessMap then this means all are unique and we return true.