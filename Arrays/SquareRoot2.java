public class SquareRoot2 {
    public static void main(String[] args) {
        Solution s = new Solution();
       
        System.out.println(s.mySqrt(8));
    }
}

class Solution {
    public int mySqrt(int x) {
        if(x==0 ||  x==1){
            return x;
        }

        int i = 1; 
        int j = x;
        return getSquareRoot(i, j, x);  
    }

    public int getSquareRoot(int i, int j, int x){
        if(i > j){
            return j;
        }

        int m = i + ((j-i)/2);  
        if(m == (x/m)){ 
            return m;
        }
        else if(m> (x/m)){ 
            j = m-1; 
            return getSquareRoot(i, j, x); 
        }
        else{
            i = m+1; 
            return getSquareRoot(i, j, x); 
        }
    }
}

//Approach
// Use binary search type approach.
// We have been given a number x, we have to find floor integer of its square root
// What we do is use the binary search approach but without going over bound of integer limit
// We take initial i and j range to be 1 to x
// We first calculate m, to calculate m we use => m = i + (j-i)/2 this makes sure we are in integer limit.
// Once m is there  we m*m == x ? but this can also go beyond integer instead we use m == x/m ?
// if yes then we return m.
// If not we further check if m> m/x if yes we reduce the j = m-1 and then return the function call again
// else we increase i = m+1 and then return the function call again.
// if (i>j) then we return j.

