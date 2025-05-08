public class SquareRoot {
    public static void main(String[] args) {
       Solution s = new Solution();
       
       System.out.println(s.mySqrt(28));
    }
}

class Solution {
    public int mySqrt(int x) {
        int n =1;

        while(true){
            if(n> (x/n)){
                break;
            }
            n++;
        }
        return n-1;
    }
}

// Approach
// We have to find the square root of x
// We take range of 1 to x, here we check for every element without any range reduction
// While checking if we come across a state where n > x/n then we return n-1.