public class ReverseInteger {

    public static void main(String[] args) {
        Solution s = new Solution();
        
        System.out.println(s.reverse(-123));
        // int test1 = (-2147483648 -3);
        // int test2 = test1/10;
        
        // System.out.println("Test1: " +test1);
        // System.out.println("Test2: " +test2);
    }
}

class Solution {
    public int reverse(int x) {
        
        
        boolean isNegative = false;
        if(x<0){
            isNegative = true;
            x = -1 * x;
        }
        
        int reverseNumber = 0;
        
        while(x!=0){
            int d = x%10;
            
            //Do checks
            if(isNegative){
                
                if(-(reverseNumber)>(-Integer.MIN_VALUE -d)/10){
                    return 0;
                }
            }
            else if(reverseNumber > (Integer.MAX_VALUE - d)/10){
                return 0;
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
// 123 -> 321
// 123%10 -> 3 | 12%10 -> 2 |  1 % 10 -> 1 | 0
// 3           | 3*10 + 2   | 32*10 + 1    | 321