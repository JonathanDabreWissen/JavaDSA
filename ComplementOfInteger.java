public class ComplementOfInteger {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.bitwiseComplement(21));
        System.out.println(s.bitwiseComplement(26));


    }
}

class Solution {
    public int bitwiseComplement(int n) {
        if(n==0){
            return 1;
        }
        
        int complementValue = 0;
        int count = 0;

        while(n!=0){
            if(n%2 == 0){
               complementValue = complementValue + (int) Math.pow(2, count); 
            }
            count++;
            n = n/2;
        }
    
        return complementValue;
         
    }
}

//Approach:
// We will use hamming weight concept, what is hamming weight?
// Hamming weight is number of one's in binary representation of a number
// how to find that ?
// To find hamming weight what we do is iteratively divide number n/2, if number results in odd we make the count++
// Here is the catch now instead of keeping watch on when the n/2 is odd, we should watch for when n/2 is even (cause we want complement)
// Dividing or multiple is shifting one bit, so we keep note of how many times the loop has runned.
// At the end of the loop we increase the count indicating the iteration is completed.
// Whenever we found n/2 even we add 2 to the power of count to the complement value.
