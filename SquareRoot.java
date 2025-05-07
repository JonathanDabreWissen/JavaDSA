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


// 4
// 1 2

// 16 
// 1 2 3 4 
// 21
// 1 2 3 4 

// 5*5 <=25
// n*n <= x
// n <= x/n
//1  36