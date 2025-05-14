public class HammingWeight {
    public static void main(String[] args) {
        
    }   
}

class Solution {
    public int hammingWeight(int n) {
        int hw = 0;

        while(n!=0){
            if(n%2 == 1){
                hw++;
            }
            n = n/2;
        }

        return hw;
    } 
}

//128 64 32 16 8 4 2 1 
//             1 0 1 1 -> 11 -> 11/2 -> 5/2 -> 2/2 -> 1
//           1 0 1 1 1 -> 23 -> 23/2 -> 11/2 -> 5/2 -> 2/2 -> 1
//           1 0 0 1 0 -> 18 -> 18/2 -> 9/2 -> 4/2 -> 2/2 -> 1
//           1 1 0 1 0 -> 26 -> 26/2 -> 13/2 -> 6/2 -> 3/2 -> 1

// Approach: 
// Starting from "n" check if the number is odd, if yes increase the hammingWeight count by 1.
// Keep checking n and keep dividing n by 2 until n==0. 
// (n=n/2)