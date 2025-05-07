public class SquareRoot2 {
    public static void main(String[] args) {
        Solution s = new Solution();
       
        System.out.println(s.mySqrt(28));
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
        if(i == j){
            return i;
        }

        int m = j - ((i-j)/2); 
        if(m == (x/m)){
            return m;
        }
        else if(m> (x/m)){
            j = m;
            return getSquareRoot(i, j, x);
        }
        else{
            i = m;
            return getSquareRoot(i, j, x);
        }
    }
}


// 100
// 1 to 100
// 50*50 > 100 => j = m;
// 50*50 < 100 => i = m; 

// m*m>x => m> (x/m)
// m*m<x => m< (x/m) 

// 1 - 101
// 1 - 51
// 1 - 26
// 1 - 13
// 7 - 13
// 10 - 13
// 10 - 12
// 10 - 11
// 10
