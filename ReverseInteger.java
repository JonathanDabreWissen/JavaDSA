public class ReverseInteger {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.reverse(-10));    
    }
}

class Solution {
    public int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }

        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -1 * x;
        }
        
        int reverseNumber = 0;
        
        while(x!=0){
            int d = x%10;
            
            if(reverseNumber > (Integer.MAX_VALUE/10)){
                return 0;
            }

            if(reverseNumber == (Integer.MAX_VALUE/10)){
                if(isNegative){
                    if(d>8){
                        return 0;
                    }
                }
                else if(d>7){
                    return 0;
                }
            }

            reverseNumber = reverseNumber*10 + d;
            x = x/10;
        }
        
        if(isNegative){
            reverseNumber = -1 * reverseNumber;
        }
        
        return reverseNumber;
    }
}

//Approach:
